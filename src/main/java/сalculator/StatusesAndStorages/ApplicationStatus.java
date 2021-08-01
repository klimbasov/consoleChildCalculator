package сalculator.StatusesAndStorages;

import сalculator.commands.CommandEnum;

public class ApplicationStatus {
    private CommandEnum lastCommand;
    private Boolean endOfExecution;
    private Float lastResult;

    public ApplicationStatus(){
        endOfExecution = false;
        lastResult = 0f;
        lastCommand = CommandEnum.INVALID;
    }

    public void setEndOfExecution(){
        endOfExecution = true;
    }

    public void setLastResult(Float result){
        lastResult = result;
    }

    public Float getLastResult() {
        return lastResult;
    }

    public Boolean IsEndOfExecution(){
        return new Boolean(endOfExecution);
    }

    public void setLastCommand(final CommandEnum command){
        lastCommand = command;
    }

    public final CommandEnum getLastCommand(){
        return lastCommand;
    }
}
