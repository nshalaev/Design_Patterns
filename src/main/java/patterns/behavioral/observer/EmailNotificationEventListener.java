package patterns.behavioral.observer;

public class EmailNotificationEventListener implements EventListener {

    private boolean isUpdated = false;

    @Override
    public void update(String eventMessage) {
        System.out.println("email - " + eventMessage);
        this.isUpdated = true;
    }

    @Override
    public boolean isUpdated() {
        return isUpdated;
    }
}
