package patterns.structural.flyweight;

import org.junit.Assert;
import org.junit.Test;


public class FlyweightTest {

    @Test
    public void test() {
        Square redMediumSquare = new Square(Color.RED, Size.MEDIUM);
        Square blackSmallSquare = new Square(Color.BLACK, Size.SMALL);
        Square redBigSquare = new Square(Color.RED, Size.BIG);
        Square blackMediumSquare = new Square(Color.BLACK, Size.MEDIUM);

        Assert.assertNotSame(redBigSquare, redMediumSquare);
        Assert.assertSame(redBigSquare.getColor(), redMediumSquare.getColor());

        Assert.assertNotSame(blackSmallSquare, blackMediumSquare);
        Assert.assertSame(blackSmallSquare.getColor(), blackMediumSquare.getColor());

        Assert.assertNotSame(redMediumSquare, blackMediumSquare);
        Assert.assertSame(redMediumSquare.getSize(), blackMediumSquare.getSize());
    }
}
