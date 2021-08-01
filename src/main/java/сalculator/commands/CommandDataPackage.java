package сalculator.commands;

import java.util.ArrayList;

public class CommandDataPackage {
    private final ArrayList<Float> operandsList;
    private String calledName;

    public CommandDataPackage(final String calledName, final ArrayList<Float> operands){
        this.calledName = calledName;
        operandsList = new ArrayList<>(operands);
    }

    public CommandDataPackage(final CommandDataPackage commandDataPackage){
        this.operandsList = new ArrayList<>(commandDataPackage.operandsList);
        this.calledName = new String(commandDataPackage.calledName);
    }

    public final ArrayList<Float> getOperandsList() {
        return new ArrayList<>(operandsList);
    }

    public final String getCalledName() {
        return new String(calledName);
    }
}
