package brigde;

import brigde.implement.MessageSender;

public abstract class Message {

    MessageSender messageSender;

    public Message(MessageSender messageSender){
        this.messageSender = messageSender;
    }

    public abstract void send();
}
