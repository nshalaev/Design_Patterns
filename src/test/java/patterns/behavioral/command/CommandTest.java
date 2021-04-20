package patterns.behavioral.command;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import patterns.behavioral.command.command.AdditionCommand;
import patterns.behavioral.command.command.Command;
import patterns.behavioral.command.command.SubtractionCommand;

public class CommandTest {

    private final static int OPERAND_A = 5;
    private final static int OPERAND_B = 4;
    private Invoker invoker;
    private CommandContext commandContext;

    @Before
    public void init() {
        invoker = new Invoker();
        commandContext = new CommandContext(5,4);
        Command addition = new AdditionCommand(commandContext);
        Command subtraction = new SubtractionCommand(commandContext);
        invoker.registerCommand("+", addition);
        invoker.registerCommand("-", subtraction);
    }

    @Test
    public void testAddition() {
        invoker.execute("+");

        Assert.assertSame(OPERAND_A + OPERAND_B, commandContext.getResult());
    }

    @Test
    public void testSubtraction() {
        invoker.execute("-");

        Assert.assertSame(OPERAND_A - OPERAND_B, commandContext.getResult());
    }
}
