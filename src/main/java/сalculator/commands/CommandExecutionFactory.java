package сalculator.commands;

import сalculator.StatusesAndStorages.ApplicationStatus;
import сalculator.calculation.CalculationModule;

import java.util.ArrayList;

public class CommandExecutionFactory {
    private final ApplicationStatus applicationStatus;
    private final CalculationModule calculationModule;


    public CommandExecutionFactory(final ApplicationStatus applicationStatus, final CalculationModule calculationModule){
        this.applicationStatus = applicationStatus;
        this.calculationModule = calculationModule;
    }
    public void makeControl(final CommandEnum commandName){
        switch (commandName){
            case END_EXECUTION -> {
                applicationStatus.setEndOfExecution();
                applicationStatus.setLastCommand(CommandEnum.END_EXECUTION);
            }
            case HELP -> {
                applicationStatus.setLastCommand(CommandEnum.HELP);
            }
            case INVALID -> {
                applicationStatus.setLastCommand(CommandEnum.INVALID);
            }
        }
    }

    public void makeCalculation(final CommandEnum commandName, final ArrayList<Float> operands){
        if(operands == null){
            applicationStatus.setLastCommand(CommandEnum.INVALID);
            return;
        }
        if(commandName.getOperandsQuantity()!=operands.size()){
            applicationStatus.setLastCommand(CommandEnum.INVALID);
            return;
        }
        applicationStatus.setLastCommand(commandName);
        Float result = 0f;
        switch (commandName){
            case ADDITION -> {
                result = calculationModule.addition(operands.get(0), operands.get(1));
                }
            case SUBTRACTION -> {
                result = calculationModule.subtraction(operands.get(0), operands.get(1));
                }
            case MULTIPLICATION -> {
                result = calculationModule.multiplication(operands.get(0), operands.get(1));
            }
            case DIVISION -> {
                result = calculationModule.division(operands.get(0), operands.get(1));
            }
            case RAISING -> {
                result = calculationModule.raising(operands.get(0), operands.get(1));
            }
        }
        applicationStatus.setLastResult(result);
    }
}
