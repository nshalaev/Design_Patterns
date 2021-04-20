package patterns.behavioral.template.method;

public class ViberMessenger extends Messenger {

    @Override
    public boolean connect() {
        System.out.println("Connecting to Viber server...");
        System.out.println("Connected to Viber server");
        return true;
    }
}
