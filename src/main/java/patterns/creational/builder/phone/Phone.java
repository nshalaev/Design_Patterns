package patterns.creational.builder.phone;

import patterns.creational.builder.detail.Battery;
import patterns.creational.builder.detail.BluetoothAdapter;
import patterns.creational.builder.detail.Camera;
import patterns.creational.builder.detail.Display;
import patterns.creational.builder.detail.Processor;
import patterns.creational.builder.detail.WiFiAdapter;

public class Phone {
    private Display display;
    private Processor processor;
    private Camera camera;
    private long memory;
    private Battery battery;
    private BluetoothAdapter bluetoothAdapter;
    private WiFiAdapter wiFiAdapter;

    public Phone(Display display,
                 Processor processor,
                 Camera camera,
                 long memory,
                 Battery battery,
                 BluetoothAdapter bluetoothAdapter,
                 WiFiAdapter wiFiAdapter) {
        this.display = display;
        this.processor = processor;
        this.camera = camera;
        this.memory = memory;
        this.battery = battery;
        this.bluetoothAdapter = bluetoothAdapter;
        this.wiFiAdapter = wiFiAdapter;
    }

    public Display getDisplay() {
        return display;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Camera getCamera() {
        return camera;
    }

    public long getMemory() {
        return memory;
    }

    public Battery getBattery() {
        return battery;
    }

    public BluetoothAdapter getBluetoothAdapter() {
        return bluetoothAdapter;
    }

    public WiFiAdapter getWiFiAdapter() {
        return wiFiAdapter;
    }
}
