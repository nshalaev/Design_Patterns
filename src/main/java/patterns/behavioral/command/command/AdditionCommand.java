package patterns.behavioral.command.command;

import patterns.behavioral.command.CommandContext;

public class AdditionCommand extends Command {

    public AdditionCommand(CommandContext commandContext) {
        super(commandContext);
    }

    @Override
    public void execute() {
        CommandContext commandContext = getCommandContext();
        int result = commandContext.getA() + commandContext.getB();
        commandContext.setResult(result);
    }
}
