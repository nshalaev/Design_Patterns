package patterns.behavioral.command.command;

import patterns.behavioral.command.CommandContext;

public abstract class Command {
    private CommandContext commandContext;

    public Command(CommandContext commandContext) {
        this.commandContext = commandContext;
    }

    public abstract void execute();

    public CommandContext getCommandContext() {
        return commandContext;
    }
}
