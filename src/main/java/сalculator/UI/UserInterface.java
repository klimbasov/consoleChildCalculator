package сalculator.UI;

import сalculator.commands.Command;
import сalculator.messages.Message;

public interface UserInterface {

    Command getCommand();

    void reportCommandResult(final Message message);
}
