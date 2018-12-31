package brigde.implement;

import brigde.implement.MessageSender;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage(){
        System.out.println("TextMessageSender: Sending text message...");
    }
}
