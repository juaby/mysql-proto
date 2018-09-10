package me.mneri.mysql.proto.packet;

import me.mneri.mysql.proto.Packet;
import me.mneri.mysql.proto.exception.ProtocolMismatchException;
import me.mneri.mysql.proto.util.ByteArrayBuilder;
import me.mneri.mysql.proto.util.ByteArrayReader;

import static me.mneri.mysql.proto.Capabilities.CLIENT_PLUGIN_AUTH;
import static me.mneri.mysql.proto.Capabilities.CLIENT_SECURE_CONNECTION;

public class Handshake10 extends Packet {
    private String authPluginData;
    private String authPluginName;
    private int capabilities;
    private int characterSet;
    private int connectionId;
    private int serverStatus;
    private String serverVersion;

    public String getAuthPluginData() {
        return authPluginData;
    }

    public String getAuthPluginName() {
        return authPluginName;
    }

    public int getCapabilities() {
        return capabilities;
    }

    public int getCharacterSet() {
        return characterSet;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public int getServerStatus() {
        return serverStatus;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    private boolean isCapabilitySet(int capability) {
        return (getCapabilities() & capability) != 0;
    }

    @Override
    public byte[] serialize() {
        ByteArrayBuilder builder = new ByteArrayBuilder();

        //@formatter:off
        builder.putInt1                 ((byte) 10);
        builder.putNullTerminatedString (getServerVersion());
        builder.putInt4                 (getConnectionId());
        builder.putFixedLengthString    (getAuthPluginData().substring(0, 8), 8);
        builder.skip                    (1);
        builder.putInt2                 ((short) getCapabilities());
        builder.putInt1                 ((byte)  getCharacterSet());
        builder.putInt2                 ((short) getServerStatus());
        builder.putInt2                 ((short) (getCapabilities() >> 16));
        //@formatter:on

        if (isCapabilitySet(CLIENT_PLUGIN_AUTH))
            builder.putInt1((byte) (getAuthPluginData().length() - 8));
        else
            builder.putInt1((byte) 0);

        builder.skip(10);

        if (isCapabilitySet(CLIENT_SECURE_CONNECTION))
            builder.putNullTerminatedString(getAuthPluginData().substring(8));

        if (isCapabilitySet(CLIENT_PLUGIN_AUTH))
            builder.putNullTerminatedString(getAuthPluginName());

        return builder.build();
    }

    public void deserialize(byte[] payload) {
        ByteArrayReader reader = new ByteArrayReader(payload);

        if (reader.getInt1() != 10)
            throw new ProtocolMismatchException();

        //@formatter:off
        setServerVersion  (reader.getNullTerminatedString());
        setConnectionId   (reader.getInt4());
        setAuthPluginData (reader.getFixedLengthString(8));
                           reader.skip(1);
        setCapabilities   (reader.getInt2() << 16);
        //@formatter:on

        if (!reader.hasMore())
            return;

        //@formatter:off
        setCharacterSet (reader.getInt1());
        setServerStatus (reader.getInt2());
        setCapabilities (reader.getInt2() | getCapabilities());
        //@formatter:on

        int length = 0;

        if (isCapabilitySet(CLIENT_PLUGIN_AUTH))
            length = reader.getInt1();
        else
            reader.skip(1);

        reader.skip(10);

        if (isCapabilitySet(CLIENT_SECURE_CONNECTION))
            setAuthPluginData(getAuthPluginData() + reader.getFixedLengthString(Math.max(13, length)));

        if (isCapabilitySet(CLIENT_PLUGIN_AUTH))
            setAuthPluginName(reader.getNullTerminatedString());
    }

    public void setAuthPluginData(String authPluginData) {
        this.authPluginData = authPluginData;
    }

    public void setAuthPluginName(String authPluginName) {
        this.authPluginName = authPluginName;
    }

    public void setCapabilities(int capabilities) {
        this.capabilities = capabilities;
    }

    public void setCharacterSet(int characterSet) {
        this.characterSet = characterSet;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public void setServerStatus(int serverStatus) {
        this.serverStatus = serverStatus;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }
}
