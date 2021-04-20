package patterns.structural.bridge.connector;

public class BaseConnector implements Connector {

    private boolean isTurnOn;
    private boolean isConnected;

    @Override
    public void connect() {
        if (!isTurnOn()) {
            throw new IllegalStateException("Connector should be turn on");
        }
        this.isConnected = true;
    }

    @Override
    public void turnOn() {
        this.isTurnOn = true;
    }

    @Override
    public void turnOf() {
        this.isConnected = false;
        this.isTurnOn = false;
    }

    @Override
    public boolean isTurnOn() {
        return this.isTurnOn;
    }

    @Override
    public boolean isConnected() {
        return this.isConnected;
    }
}
