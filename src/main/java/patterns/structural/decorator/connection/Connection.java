package patterns.structural.decorator.connection;

public interface Connection {
    boolean isSent();
    void send(byte[] data);
}
