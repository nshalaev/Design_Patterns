package patterns.creational.builder;

import org.junit.Assert;
import org.junit.Test;
import patterns.creational.builder.detail.Battery;
import patterns.creational.builder.detail.BluetoothAdapter;
import patterns.creational.builder.detail.Camera;
import patterns.creational.builder.detail.Display;
import patterns.creational.builder.detail.Processor;
import patterns.creational.builder.detail.WiFiAdapter;
import patterns.creational.builder.phone.Phone;
import patterns.creational.builder.phone.PhoneBuilder;
import patterns.creational.builder.phone.PhoneBuilderDirector;

public class BuilderTest {

    private static final long MEMORY = 1;

    @Test
    public void testSimpleCreation() {
        Phone phone = new PhoneBuilder()
                .setBattery(new Battery(1))
                .setBluetoothAdapter(new BluetoothAdapter())
                .setCamera(new Camera(1))
                .setDisplay(new Display(1, 1))
                .setMemory(MEMORY)
                .setProcessor(new Processor())
                .setWiFiAdapter(new WiFiAdapter())
                .build();

        Assert.assertNotNull(phone);
        Assert.assertNotNull(phone.getDisplay());
        Assert.assertNotNull(phone.getProcessor());
        Assert.assertNotNull(phone.getCamera());
        Assert.assertEquals(MEMORY, phone.getMemory());
        Assert.assertNotNull(phone.getBattery());
        Assert.assertNotNull(phone.getBluetoothAdapter());
        Assert.assertNotNull(phone.getWiFiAdapter());
    }

    @Test
    public void testDirector() {
        PhoneBuilderDirector director = new PhoneBuilderDirector();

        PhoneBuilder powerfulPhoneBuilder = new PhoneBuilder();
        director.constructPowerfulPhone(powerfulPhoneBuilder);
        Phone powerfulPhone = powerfulPhoneBuilder.build();

        PhoneBuilder cheapPhoneBuilder = new PhoneBuilder();
        director.constructCheapPhone(cheapPhoneBuilder);
        Phone cheapPhone = cheapPhoneBuilder.build();

        Assert.assertTrue(powerfulPhone.getMemory() > cheapPhone.getMemory());
        Assert.assertTrue(powerfulPhone.getBattery().getCapacity() > cheapPhone.getBattery().getCapacity());
        Assert.assertTrue(powerfulPhone.getCamera().getMegapixels() > cheapPhone.getCamera().getMegapixels());
        Assert.assertTrue(powerfulPhone.getDisplay().getHeight() > cheapPhone.getDisplay().getHeight());
        Assert.assertTrue(powerfulPhone.getDisplay().getWidth() > cheapPhone.getDisplay().getWidth());
    }
}
