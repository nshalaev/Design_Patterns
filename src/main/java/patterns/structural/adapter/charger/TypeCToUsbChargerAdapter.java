package patterns.structural.adapter.charger;

//adapter
public class TypeCToUsbChargerAdapter extends TypeCCharger {

    private UsbCharger usbCharger;

    public TypeCToUsbChargerAdapter(UsbCharger usbCharger) {
        this.usbCharger = usbCharger;
    }

    @Override
    public void typeCCharge() {
        this.usbCharger.usbCharge();
    }
}
