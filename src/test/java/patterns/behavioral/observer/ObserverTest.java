package patterns.behavioral.observer;

import org.junit.Assert;
import org.junit.Test;

public class ObserverTest {

    @Test
    public void testAllEventListeners() {
        EventManager eventManager = new EventManager();
        EventListener emailListener = new EmailNotificationEventListener();
        EventListener logListener = new LogEventListener();
        eventManager.subscribe(emailListener);
        eventManager.subscribe(logListener);

        Assert.assertFalse(emailListener.isUpdated());
        Assert.assertFalse(logListener.isUpdated());

        SomePublisher publisher = new SomePublisher(eventManager);
        publisher.doSomething();

        Assert.assertTrue(emailListener.isUpdated());
        Assert.assertTrue(logListener.isUpdated());
    }

    @Test
    public void testUnsubscribing() {
        EventManager eventManager = new EventManager();
        EventListener emailListener = new EmailNotificationEventListener();
        EventListener logListener = new LogEventListener();
        eventManager.subscribe(emailListener);
        eventManager.subscribe(logListener);

        Assert.assertFalse(emailListener.isUpdated());
        Assert.assertFalse(logListener.isUpdated());

        eventManager.unsubscribe(logListener);
        SomePublisher publisher = new SomePublisher(eventManager);
        publisher.doSomething();

        Assert.assertTrue(emailListener.isUpdated());
        Assert.assertFalse(logListener.isUpdated());
    }
}
