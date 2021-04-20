package patterns.behavioral.observer;

public class LogEventListener implements EventListener {

    private boolean isUpdated = false;

    @Override
    public void update(String eventMessage) {
        System.out.println("log - " + eventMessage);
        this.isUpdated = true;
    }

    @Override
    public boolean isUpdated() {
        return isUpdated;
    }
}
