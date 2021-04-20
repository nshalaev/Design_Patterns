package patterns.creational.builder.phone;

import patterns.creational.builder.detail.Battery;
import patterns.creational.builder.detail.Camera;
import patterns.creational.builder.detail.Display;

public class PhoneBuilderDirector {

    public void constructPowerfulPhone(PhoneBuilder builder) {
        builder.setDisplay(new Display(1024, 1600));
        builder.setCamera(new Camera(12));
        builder.setMemory(500000000);
        builder.setBattery(new Battery(10000));
    }

    public void constructCheapPhone(PhoneBuilder builder) {
        builder.setDisplay(new Display(480, 640));
        builder.setCamera(new Camera(3.5));
        builder.setMemory(10000000);
        builder.setBattery(new Battery(3000));
    }

}
