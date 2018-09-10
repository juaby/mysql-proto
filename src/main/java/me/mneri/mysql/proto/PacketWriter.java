package me.mneri.mysql.proto;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import me.mneri.mysql.proto.exception.MalformedPacketException;
import me.mneri.mysql.proto.util.ByteArrayBuilder;

class PacketWriter implements Closeable {
    private Context context;

    PacketWriter(Context context) {
        this.context = context;
    }

    @Override
    public void close() throws IOException {
        context.getOutputStream().close();
    }

    void write(Packet packet) throws IOException, MalformedPacketException {
        byte[] payload = packet.payload();

        ByteArrayBuilder builder = new ByteArrayBuilder(4);
        builder.putInt3(payload.length);
        builder.putInt1(packet.getSequenceId());
        byte[] header = builder.build();

        OutputStream out = context.getOutputStream();
        out.write(header);
        out.write(payload);
        out.flush();
    }
}