package patterns.structural.adapter;

import org.junit.Assert;
import org.junit.Test;
import patterns.structural.adapter.charger.TypeCCharger;
import patterns.structural.adapter.charger.TypeCToUsbChargerAdapter;
import patterns.structural.adapter.charger.UsbCharger;
import patterns.structural.adapter.device.EBookReader;
import patterns.structural.adapter.device.Phone;
import patterns.structural.adapter.device.TypeCDevice;
import patterns.structural.adapter.device.UsbDevice;

public class AdapterTest {

    @Test
    public void testEBookReaderUsbCharging() {
        UsbDevice usbDevice = new EBookReader();
        UsbCharger usbCharger = new UsbCharger();

        Assert.assertFalse(usbDevice.isCharging());

        usbDevice.usbCharge(usbCharger);

        Assert.assertTrue(usbDevice.isCharging());
    }

    @Test
    public void testPhoneTypeCCharging() {
        TypeCDevice typeCDevice = new Phone();
        TypeCCharger typeCCharger = new TypeCCharger();

        Assert.assertFalse(typeCDevice.isCharging());

        typeCDevice.typeCCharge(typeCCharger);

        Assert.assertTrue(typeCDevice.isCharging());
    }

    @Test
    public void testPhoneUsbChargingByAdapter() {
        TypeCDevice typeCDevice = new Phone();
        UsbCharger usbCharger = new UsbCharger();
        TypeCToUsbChargerAdapter adapter = new TypeCToUsbChargerAdapter(usbCharger);

        Assert.assertFalse(typeCDevice.isCharging());

        typeCDevice.typeCCharge(adapter);

        Assert.assertTrue(typeCDevice.isCharging());
    }
}
