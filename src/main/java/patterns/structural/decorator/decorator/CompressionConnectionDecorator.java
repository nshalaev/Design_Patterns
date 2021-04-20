package patterns.structural.decorator.decorator;

import patterns.structural.decorator.connection.Connection;

public class CompressionConnectionDecorator extends ConnectionDecorator {

    private boolean isCompressed = false;

    public CompressionConnectionDecorator(Connection connection) {
        super(connection);
    }

    @Override
    public void send(byte[] data) {
        super.send(
                compress(data)
        );
    }

    public boolean isCompressed() {
        return isCompressed;
    }

    private byte[] compress(byte[] data) {
        this.isCompressed = true;
        return data;
    }
}
