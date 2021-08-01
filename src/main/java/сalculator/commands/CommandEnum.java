package сalculator.commands;

public enum CommandEnum {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    RAISING,
    END_EXECUTION,
    INVALID,
    HELP;
    public Integer getOperandsQuantity(){
        Integer operandsQuantity = 0;
        switch(this){
            case ADDITION -> operandsQuantity = 2;
            case SUBTRACTION -> operandsQuantity = 2;
            case MULTIPLICATION -> operandsQuantity = 2;
            case DIVISION -> operandsQuantity = 2;
            case RAISING -> operandsQuantity = 2;
            case END_EXECUTION -> operandsQuantity = 0;
            case INVALID -> operandsQuantity = 0;
            case HELP -> operandsQuantity = 0;
        }
        return  operandsQuantity;
    }
    public CommandTypeEnum getCommandType(){
        CommandTypeEnum commandType = CommandTypeEnum.CONTROL;
        switch(this){
            case ADDITION -> commandType = CommandTypeEnum.CALCULATION;
            case SUBTRACTION -> commandType = CommandTypeEnum.CALCULATION;
            case MULTIPLICATION -> commandType = CommandTypeEnum.CALCULATION;
            case DIVISION -> commandType = CommandTypeEnum.CALCULATION;
            case RAISING -> commandType = CommandTypeEnum.CALCULATION;
            case END_EXECUTION -> commandType = CommandTypeEnum.CONTROL;
            case INVALID -> commandType = CommandTypeEnum.CONTROL;
            case HELP -> commandType = CommandTypeEnum.CONTROL;
        }
        return  commandType;
    }
}
