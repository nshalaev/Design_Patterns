package patterns.behavioral.memento;

import org.junit.Assert;
import org.junit.Test;

public class MementoTest {

    private static final int FIRST_OPERAND = 3;
    private static final int SECOND_OPERAND = 2;
    private static final int THIRD_OPERAND = 4;

    @Test
    public void testMemento() {
        SumAccumulator sumAccumulator = new SumAccumulator();
        sumAccumulator.add(FIRST_OPERAND);
        sumAccumulator.add(SECOND_OPERAND);
        sumAccumulator.add(THIRD_OPERAND);

        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND + THIRD_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND + THIRD_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.undo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.undo();
        Assert.assertSame(FIRST_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.undo();
        Assert.assertSame(0, sumAccumulator.getAccumulator());
        sumAccumulator.undo();
        Assert.assertSame(0, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.undo();
        Assert.assertSame(FIRST_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND + THIRD_OPERAND, sumAccumulator.getAccumulator());
        sumAccumulator.redo();
        Assert.assertSame(FIRST_OPERAND + SECOND_OPERAND + THIRD_OPERAND, sumAccumulator.getAccumulator());

    }
}
