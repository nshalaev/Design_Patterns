package patterns.structural.bridge.connector;

public interface Connector {
    void connect();
    void turnOn();
    void turnOf();
    boolean isTurnOn();
    boolean isConnected();
}
