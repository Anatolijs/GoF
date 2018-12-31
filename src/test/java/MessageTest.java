import brigde.EmailMessage;
import brigde.Message;
import brigde.TextMessage;
import brigde.implement.EmailMessageSender;
import brigde.implement.MessageSender;
import brigde.implement.TextMessageSender;
import org.junit.Test;

public class MessageTest {

    @Test
    public void testSendMessage() throws Exception {
        MessageSender textMessageSender = new TextMessageSender();
        Message textMessage = new TextMessage(textMessageSender);
        textMessage.send();

        MessageSender emailMessageSender = new EmailMessageSender();
        Message emailMessage = new EmailMessage(emailMessageSender);
        emailMessage.send();
    }
}
