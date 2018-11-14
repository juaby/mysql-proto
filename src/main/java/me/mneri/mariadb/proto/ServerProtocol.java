package me.mneri.mariadb.proto;

import me.mneri.mariadb.proto.exception.MalformedPacketException;
import me.mneri.mariadb.proto.packet.Handshake10;
import me.mneri.mariadb.proto.packet.HandshakeResponse41;
import me.mneri.mariadb.proto.packet.OkPacket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static me.mneri.mariadb.proto.Capabilities.CLIENT_PLUGIN_AUTH;
import static me.mneri.mariadb.proto.Capabilities.CLIENT_SECURE_CONNECTION;

public class ServerProtocol {
    private Context context;

    private ServerProtocol(InputStream in, OutputStream out) {
        context = new Context(in, out);
    }

    private void start() {
        try {
            //@formatter:off
            Handshake10 handshake = context.create(Handshake10.class, (byte) 0);

            handshake.setServerVersion  ("5.5.2-m2");
            handshake.setConnectionId   (0);
            handshake.setAuthPluginData ("dvH@I-CJ*4d|cZwk4^]:.");
            handshake.setCapabilities   (0xf5ff | CLIENT_PLUGIN_AUTH | CLIENT_SECURE_CONNECTION);
            handshake.setCharacterSet   (0x08);
            handshake.setServerStatus   (ServerStatus.AUTOCOMMIT);
            handshake.setAuthPluginName ("mysql_native_password");

            context.send(handshake);
            //@formatter:on

            HandshakeResponse41 handshakeResponse = context.receive(HandshakeResponse41.class);
            handshakeResponse.toString();

            OkPacket ok = context.create(OkPacket.class, (byte) 2);
            ok.setInfo("Login successful");
            context.send(ok);
            System.out.println("end");
        } catch (IOException | MalformedPacketException e) {
            e.printStackTrace();
        }
    }

    public static void start(InputStream in, OutputStream out) {
        ServerProtocol proto = new ServerProtocol(in, out);
        proto.start();
    }
}
