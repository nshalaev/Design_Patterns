package patterns.creational.prototype;

import org.junit.Assert;
import org.junit.Test;
import patterns.creational.prototype.factory.PrototypeFactory;
import patterns.creational.prototype.shape.Circle;
import patterns.creational.prototype.shape.Rectangle;
import patterns.creational.prototype.shape.Shape;

public class PrototypeTest {

    @Test
    public void testRectanglePrototype() {
        Shape rectangle = new Rectangle("red", 2, 3);
        Shape cloned = rectangle.clone();

        Assert.assertEquals(rectangle, cloned);
        Assert.assertNotSame(rectangle, cloned);
    }

    @Test
    public void testCirclePrototype() {
        Shape circle = new Circle("blue", 4);
        Shape cloned = circle.clone();

        Assert.assertEquals(circle, cloned);
        Assert.assertNotSame(circle, cloned);
    }

    @Test
    public void testPrototypeFactoryGet() {
        PrototypeFactory prototypeFactory = new PrototypeFactory();
        Shape shape1 = prototypeFactory.get("blue rectangle 2x3")
                .orElseThrow();
        Shape shape2 = prototypeFactory.get("blue rectangle 2x3")
                .orElseThrow();

        Assert.assertEquals(shape1, shape2);
        Assert.assertNotSame(shape1, shape2);
    }
}
