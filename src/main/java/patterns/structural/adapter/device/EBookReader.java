package patterns.structural.adapter.device;

import patterns.structural.adapter.charger.UsbCharger;

public class EBookReader implements UsbDevice {

    private boolean isCharging = false;

    @Override
    public void usbCharge(UsbCharger charger) {
        if (charger != null) {
            this.isCharging = true;
            charger.usbCharge();
        }
    }

    @Override
    public boolean isCharging() {
        return this.isCharging;
    }
}
