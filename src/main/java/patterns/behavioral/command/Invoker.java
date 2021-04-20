package patterns.behavioral.command;

import patterns.behavioral.command.command.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Invoker {

    Map<String, Command> commandMap = new HashMap<>();

    public void registerCommand(String mnemonic, Command command) {
        commandMap.put(mnemonic, command);
    }

    public void execute(String mnemonic) {
        Command command = commandMap.get(mnemonic);
        if (Objects.nonNull(command)) {
            command.execute();
        }
    }
}
