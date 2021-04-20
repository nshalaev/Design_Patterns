package patterns.behavioral.state;

import org.junit.Assert;
import org.junit.Test;

public class StateTest {

    @Test
    public void testChangingStates() {
        Task task = new Task();

        Assert.assertTrue(task.getState() instanceof ToDoState);

        task.nextState();
        Assert.assertTrue(task.getState() instanceof InProgressState);

        task.nextState();
        Assert.assertTrue(task.getState() instanceof DoneState);

        task.nextState();
        Assert.assertTrue(task.getState() instanceof DoneState);
    }
}
