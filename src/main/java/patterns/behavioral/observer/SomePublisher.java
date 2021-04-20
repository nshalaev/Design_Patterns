package patterns.behavioral.observer;

public class SomePublisher {
    private EventManager eventManager;

    public SomePublisher(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void doSomething() {
        eventManager.notify("Publisher did something");
    }
}
