package patterns.structural.decorator.decorator;

import patterns.structural.decorator.connection.Connection;

public class EncryptionConnectionDecorator extends ConnectionDecorator {

    private boolean isEncrypted = false;

    public EncryptionConnectionDecorator(Connection connection) {
        super(connection);
    }

    @Override
    public void send(byte[] data) {
        super.send(encrypt(data));
    }

    public boolean isWasEncrypted() {
        return isEncrypted;
    }

    private byte[] encrypt(byte[] data) {
        this.isEncrypted = true;
        return data;
    }
}
