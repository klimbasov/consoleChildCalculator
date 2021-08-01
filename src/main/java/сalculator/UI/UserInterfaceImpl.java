package сalculator.UI;

import сalculator.commands.Command;
import сalculator.commands.CommandDataPackage;
import сalculator.commands.CommandFactory;
import сalculator.messages.Message;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterfaceImpl implements UserInterface {
    private final Scanner scanner;
    private Scanner parser;
    private final CommandFactory commandFactory;

    public UserInterfaceImpl(final CommandFactory commandFactory){
        this.commandFactory = commandFactory;
        this.scanner = new Scanner(System.in);
    }

    private String getConsoleInput(){
        return new String(scanner.next());
    }

    private void sendToConsoleOutput(String message) {
        System.out.println(message);
    }

    private void clearInput(){
        scanner.skip(".*\n");
    }

    @Override
    public Command getCommand(){
        String commandName;
        ArrayList<Float> commandOperands = new ArrayList<>();

        String consoleLine = scanner.nextLine();

        try {
            parser = new Scanner(consoleLine);
            if(parser.hasNext()==false){
                throw new Exception("Command name was null");
            }
            commandName = parser.next();
            while (parser.hasNext()){
                commandOperands.add(Float.parseFloat(parser.next()));
            }

        }catch (Exception exception){
            return commandFactory.createCommand(new CommandDataPackage(new String(), new ArrayList<>()));
        }
        return commandFactory.createCommand(new CommandDataPackage(commandName, commandOperands));
    }
    /*
    public Command _getCommand() {
        CommandEnum commandName = CommandEnum.INVALID;
        Float[] operandsArray;
        String consoleInputString = this.getConsoleInput();
        for(CommandEnum enumConstant: CommandEnum.values()){
            if(consoleInputString.equals(enumConstant.name())){
                commandName = enumConstant;
            }
        }
        try{
            operandsArray = new Float[commandName.getOperandsQuantity()];
            for (Integer counter =0; counter < commandName.getOperandsQuantity(); counter++){
                operandsArray[counter] = Float.parseFloat(this.getConsoleInput());
            }
        }catch (Exception exception){
            return commandFactory.createCommand(CommandEnum.INVALID, new CommandDataPackage(new Float[0]));
        }finally {
            this.clearInput();
        }
        return commandFactory.createCommand(commandName, new CommandDataPackage(operandsArray));
    }
    */


    @Override
    public void reportCommandResult(final Message message) {
        sendToConsoleOutput(message.getMessageText());
    }
}
