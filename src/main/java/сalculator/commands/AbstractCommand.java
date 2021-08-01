package сalculator.commands;

public abstract class AbstractCommand {
    protected final CommandDataPackage commandDataPackage;
    protected final CommandEnum commandName;

    protected AbstractCommand(final CommandDataPackage commandDataPackage, final CommandEnum commandName){
        this.commandDataPackage = new CommandDataPackage(commandDataPackage);        //here i realized, hat "package" is reserved...
        this.commandName = commandName;
    }

    public final CommandDataPackage getCommandDataPackage() {
        return new CommandDataPackage(commandDataPackage);
    }
}
