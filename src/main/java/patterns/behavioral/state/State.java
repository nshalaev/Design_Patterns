package patterns.behavioral.state;

public abstract class State {
    private Task task;

    public State(Task task) {
        this.task = task;
    }

    public abstract State nextState();

    public Task getTask() {
        return task;
    }
}
