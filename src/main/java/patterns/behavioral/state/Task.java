package patterns.behavioral.state;

public class Task {
    private State state;

    public Task() {
        this.state = new ToDoState(this);
    }

    public void nextState() {
        state = state.nextState();
    }

    public State getState() {
        return state;
    }
}
