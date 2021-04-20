package patterns.behavioral.template.method;

public class TelegramMessenger extends Messenger {

    @Override
    public boolean connect() {
        System.out.println("Connecting to Telegram server...");
        System.out.println("Connected to Telegram server");
        return true;
    }
}
