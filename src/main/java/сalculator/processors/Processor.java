package сalculator.processors;

import сalculator.UI.UserInterface;
import сalculator.StatusesAndStorages.ApplicationStatus;
import сalculator.commands.Command;
import сalculator.messages.MessageGenerator;

public class Processor {
    private final UserInterface userInterface;
    private final ApplicationStatus applicationStatus;
    private final MessageGenerator messageGenerator;
    public Processor(final UserInterface userInterface, final ApplicationStatus applicationStatus){
        this.userInterface = userInterface;
        this.applicationStatus = applicationStatus;
        this.messageGenerator = new MessageGenerator(this.applicationStatus);
    }

    public void run(){
        Command currentCommand;
        while (applicationStatus.IsEndOfExecution() == false){
            currentCommand = userInterface.getCommand();
            currentCommand.run();
            userInterface.reportCommandResult(messageGenerator.report());
        }
    }
}
