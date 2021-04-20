package patterns.creational.builder.phone;

import patterns.creational.builder.detail.Battery;
import patterns.creational.builder.detail.BluetoothAdapter;
import patterns.creational.builder.detail.Camera;
import patterns.creational.builder.detail.Display;
import patterns.creational.builder.detail.Processor;
import patterns.creational.builder.detail.WiFiAdapter;

public class PhoneBuilder {
    private Display display;
    private Processor processor;
    private Camera camera;
    private long memory;
    private Battery battery;
    private BluetoothAdapter bluetoothAdapter;
    private WiFiAdapter wiFiAdapter;

    public PhoneBuilder setDisplay(Display display) {
        this.display = display;
        return this;
    }

    public PhoneBuilder setProcessor(Processor processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setCamera(Camera camera) {
        this.camera = camera;
        return this;
    }

    public PhoneBuilder setMemory(long memory) {
        this.memory = memory;
        return this;
    }

    public PhoneBuilder setBattery(Battery battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setBluetoothAdapter(BluetoothAdapter bluetoothAdapter) {
        this.bluetoothAdapter = bluetoothAdapter;
        return this;
    }

    public PhoneBuilder setWiFiAdapter(WiFiAdapter wiFiAdapter) {
        this.wiFiAdapter = wiFiAdapter;
        return this;
    }

    public Phone build() {
        return new Phone(display, processor, camera, memory, battery, bluetoothAdapter, wiFiAdapter);
    }
}
