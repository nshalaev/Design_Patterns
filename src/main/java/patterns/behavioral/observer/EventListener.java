package patterns.behavioral.observer;

public interface EventListener {
    void update(String eventMessage);
    boolean isUpdated();
}
