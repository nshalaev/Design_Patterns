package patterns.structural.bridge;

import org.junit.Assert;
import org.junit.Test;
import patterns.structural.bridge.connector.Connector;
import patterns.structural.bridge.connector.GSMConnector;
import patterns.structural.bridge.connector.WiFiConnector;
import patterns.structural.bridge.device.Device;
import patterns.structural.bridge.device.Phone;
import patterns.structural.bridge.device.Tablet;

public class BridgeTest {

    @Test
    public void phoneConnectViaGSM() {
        Connector connector = new GSMConnector();
        Device device = new Phone(connector);

        device.turnOnConnector();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());

        device.connect();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertTrue(connector.isConnected());

        device.turnOfConnector();
        Assert.assertFalse(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());
    }

    @Test
    public void phoneConnectViaWIFI() {
        Connector connector = new WiFiConnector();
        Device device = new Phone(connector);

        device.turnOnConnector();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());

        device.connect();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertTrue(connector.isConnected());

        device.turnOfConnector();
        Assert.assertFalse(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());
    }

    @Test
    public void tabletConnectViaGSM() {
        Connector connector = new GSMConnector();
        Device device = new Tablet(connector);

        device.turnOnConnector();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());

        device.connect();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertTrue(connector.isConnected());

        device.turnOfConnector();
        Assert.assertFalse(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());
    }

    @Test
    public void tabletConnectViaWIFI() {
        Connector connector = new WiFiConnector();
        Device device = new Tablet(connector);

        device.turnOnConnector();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());

        device.connect();
        Assert.assertTrue(connector.isTurnOn());
        Assert.assertTrue(connector.isConnected());

        device.turnOfConnector();
        Assert.assertFalse(connector.isTurnOn());
        Assert.assertFalse(connector.isConnected());
    }

    @Test(expected = IllegalStateException.class)
    public void throwException() {
        Connector connector = new WiFiConnector();
        Device device = new Tablet(connector);
        device.connect();
    }
}
