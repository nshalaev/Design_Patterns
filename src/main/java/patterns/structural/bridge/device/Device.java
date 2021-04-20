package patterns.structural.bridge.device;

import patterns.structural.bridge.connector.Connector;

public interface Device {
    void connect();
    void turnOnConnector();
    void turnOfConnector();
    Connector getConnector();
}
