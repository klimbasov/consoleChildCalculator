package сalculator.commands;

import сalculator.commands.commandImplementations.*;

public class CommandFactory {
    private final CommandExecutionFactory commandExecutionFactory;

    public CommandFactory(final CommandExecutionFactory commandExecutionFactory){
        this.commandExecutionFactory = commandExecutionFactory;
    }

    public Command createCommand(final CommandDataPackage operandPackage) {
        Command command = null;
        CommandEnum commandName = determineCommandName(operandPackage.getCalledName());
        switch (commandName.getCommandType()) {
            case CALCULATION -> {
                command = new CalculationCommandImpl(operandPackage, commandName, commandExecutionFactory);
            }
            case CONTROL -> {
                command = new ControlCommandImpl(operandPackage, commandName, commandExecutionFactory);
            }
        }
        return command;
    }

    private final CommandEnum determineCommandName(final String expresion){
        CommandEnum commandName = CommandEnum.INVALID;
        for(CommandEnum enumConstant: CommandEnum.values()){
            if(expresion.equals(enumConstant.name())){
                commandName = enumConstant;
            }
        }
        return  commandName;
    }
}
