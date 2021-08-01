package сalculator.messages;

import сalculator.StatusesAndStorages.MessageTexts;
import сalculator.StatusesAndStorages.ApplicationStatus;

public class MessageGenerator {

    private final ApplicationStatus applicationStatus;

    public MessageGenerator(final ApplicationStatus applicationStatus){
        this.applicationStatus = applicationStatus;
    }

    public final MessageImpl report(){
        String report;
        switch (applicationStatus.getLastCommand()) {
            case END_EXECUTION -> {
                report = "Execution finished.";
            }
            case INVALID -> {
                report = "an unfatal error has occured! Enter command again carefully.";
            }
            case HELP -> {
                report = MessageTexts.helpMessage;
            }
            default -> {
                report = "result is " + applicationStatus.getLastResult() + ".";
            }
        }
        return new MessageImpl(report);
    }
}
