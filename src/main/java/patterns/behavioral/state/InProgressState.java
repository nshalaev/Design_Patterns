package patterns.behavioral.state;

public class InProgressState extends State {

    public InProgressState(Task task) {
        super(task);
    }

    @Override
    public State nextState() {
        return new DoneState(getTask());
    }
}
