package patterns.structural.bridge.device;

import patterns.structural.bridge.connector.Connector;

public class Tablet implements Device {

    private Connector connector;

    public Tablet(Connector connector) {
        this.connector = connector;
    }

    @Override
    public void connect() {
        this.connector.connect();
    }

    @Override
    public void turnOnConnector() {
        this.connector.turnOn();
    }

    @Override
    public void turnOfConnector() {
        if (this.connector.isTurnOn()) {
            this.connector.turnOf();
        }
    }

    @Override
    public Connector getConnector() {
        return this.connector;
    }
}
