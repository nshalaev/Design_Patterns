package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<EventListener> eventListeners = new ArrayList<>();

    public void subscribe(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void unsubscribe(EventListener eventListener) {
        eventListeners.remove(eventListener);
    }

    public void notify(String eventMessage) {
        eventListeners.forEach(
                eventListener -> eventListener.update(eventMessage));
    }
}
