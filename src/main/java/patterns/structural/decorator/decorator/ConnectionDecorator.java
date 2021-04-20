package patterns.structural.decorator.decorator;

import patterns.structural.decorator.connection.Connection;

public class ConnectionDecorator implements Connection {

    private Connection connection;

    public ConnectionDecorator(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean isSent() {
        return connection.isSent();
    }

    @Override
    public void send(byte[] data) {
        connection.send(data);
    }

}
