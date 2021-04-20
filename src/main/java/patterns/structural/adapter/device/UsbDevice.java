package patterns.structural.adapter.device;

import patterns.structural.adapter.charger.UsbCharger;

public interface UsbDevice extends Device {
    void usbCharge(UsbCharger charger);
}
