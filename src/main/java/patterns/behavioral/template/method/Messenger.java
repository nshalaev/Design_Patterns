package patterns.behavioral.template.method;

public abstract class Messenger {

    private boolean isMessageSent;

    public abstract boolean connect();

    public void sendMessage() {
        if (connect()) {
            isMessageSent = true;
            System.out.println("Message sent to " + this.getClass().getSimpleName());
        }
    }

    public boolean isMessageSent() {
        return isMessageSent;
    }
}
