package patterns.behavioral.template.method;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {

    @Test
    public void testTelegram() {
        Messenger messenger = new TelegramMessenger();
        messenger.sendMessage();

        Assert.assertTrue(messenger.isMessageSent());
    }

    @Test
    public void testViber() {
        Messenger messenger = new ViberMessenger();
        messenger.sendMessage();

        Assert.assertTrue(messenger.isMessageSent());
    }
}
