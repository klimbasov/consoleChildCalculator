package сalculator.commands.commandImplementations;

import сalculator.commands.*;

public class CalculationCommandImpl extends AbstractCommand implements Command {
    private final CommandExecutionFactory commandExecutionFactory;

    public CalculationCommandImpl(final CommandDataPackage commandDataPackage, final CommandEnum commandName, final CommandExecutionFactory commandExecutionFactory) {
        super(commandDataPackage, commandName);
        this.commandExecutionFactory = commandExecutionFactory;
    }

    @Override
    public void run() {
        commandExecutionFactory.makeCalculation(this.commandName, this.commandDataPackage.getOperandsList());
    }
}
