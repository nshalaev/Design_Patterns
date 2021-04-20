package patterns.structural.decorator.connection;

public class BaseConnection implements Connection {

    private boolean isSent;

    @Override
    public boolean isSent() {
        return isSent;
    }

    @Override
    public void send(byte[] data) {
        this.isSent = true;
    }
}
