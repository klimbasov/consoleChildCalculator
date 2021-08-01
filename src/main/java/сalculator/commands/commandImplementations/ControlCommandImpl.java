package сalculator.commands.commandImplementations;

import сalculator.commands.*;

public class ControlCommandImpl extends AbstractCommand implements Command {
    private final CommandExecutionFactory commandExecutionFactory;

    public ControlCommandImpl(final CommandDataPackage commandDataPackage, final CommandEnum commandName, final CommandExecutionFactory commandExecutionFactory) {
        super(commandDataPackage, commandName);
        this.commandExecutionFactory = commandExecutionFactory;
    }

    @Override
    public void run() {
        commandExecutionFactory.makeControl(this.commandName);
    }
}
