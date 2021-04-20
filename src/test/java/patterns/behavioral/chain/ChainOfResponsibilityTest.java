package patterns.behavioral.chain;

import org.junit.Assert;
import org.junit.Test;
import patterns.behavioral.chain.model.SomeObject;
import patterns.behavioral.chain.processor.FormatProcessor;
import patterns.behavioral.chain.processor.Processor;
import patterns.behavioral.chain.processor.ValidationProcessor;

public class ChainOfResponsibilityTest {

    @Test
    public void testChain() {
        Processor processor = new ValidationProcessor();
        processor.linkedWith(new FormatProcessor(4));
        SomeObject someObject = new SomeObject("Name", "Some info");

        processor.process(someObject);

        Assert.assertEquals("Some", someObject.getInfo());
    }

    @Test(expected = NullPointerException.class)
    public void testChainWhenNameIsNull() {
        Processor processor = new ValidationProcessor();
        processor.linkedWith(new FormatProcessor(4));
        SomeObject someObject = new SomeObject(null, "Some info");

        processor.process(someObject);
    }

    @Test(expected = NullPointerException.class)
    public void testChainWhenInfoIsNull() {
        Processor processor = new ValidationProcessor();
        processor.linkedWith(new FormatProcessor(4));
        SomeObject someObject = new SomeObject("Name", null);

        processor.process(someObject);
    }

    @Test(expected = NullPointerException.class)
    public void testChainWhenSomeObjectIsNull() {
        Processor processor = new ValidationProcessor();
        processor.linkedWith(new FormatProcessor(4));

        processor.process(null);
    }
}
