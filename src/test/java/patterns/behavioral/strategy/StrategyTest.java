package patterns.behavioral.strategy;

import org.junit.Assert;
import org.junit.Test;
import patterns.behavioral.strategy.operation.AdditionOperation;
import patterns.behavioral.strategy.operation.SubtractionOperation;

public class StrategyTest {

    @Test
    public void testOperations() {
        int a = 5;
        int b = 3;
        Calculator calculator = new Calculator(a, b);

        calculator.setOperation(new AdditionOperation());
        Assert.assertSame(a + b, calculator.calculate());

        calculator.setOperation(new SubtractionOperation());
        Assert.assertSame(a - b, calculator.calculate());
    }
}
