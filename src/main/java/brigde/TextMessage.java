package brigde;

import brigde.implement.MessageSender;

public class TextMessage extends Message {

    public TextMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send(){
        messageSender.sendMessage();
    }
}
