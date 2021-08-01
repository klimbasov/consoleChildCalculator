package сalculator;

import сalculator.commands.CommandFactory;
import сalculator.UI.UserInterface;
import сalculator.UI.UserInterfaceImpl;
import сalculator.StatusesAndStorages.ApplicationStatus;
import сalculator.calculation.CalculationModule;
import сalculator.calculation.CalculationModuleImpl;
import сalculator.commands.CommandExecutionFactory;
import сalculator.processors.Processor;

public class Calculator {
    public static void main(String[] args){
        ApplicationStatus applicationStatus = new ApplicationStatus();
        CalculationModule calculationModule = new CalculationModuleImpl();
        CommandExecutionFactory commandExecutionFactory = new CommandExecutionFactory(applicationStatus, calculationModule);
        CommandFactory commandFactory = new CommandFactory(commandExecutionFactory);
        UserInterface userInterface = new UserInterfaceImpl(commandFactory);
        Processor processor = new Processor( userInterface, applicationStatus);

        processor.run();
    }
}
