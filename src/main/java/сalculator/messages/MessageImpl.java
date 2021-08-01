package сalculator.messages;

public class MessageImpl implements Message{
    private String messageText;

    MessageImpl(final String messageText){
        this.messageText = messageText;
    }

    @Override
    public String getMessageText() {
        return new String(messageText);
    }

}
