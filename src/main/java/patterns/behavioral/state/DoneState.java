package patterns.behavioral.state;

public class DoneState extends State {

    public DoneState(Task task) {
        super(task);
    }

    @Override
    public State nextState() {
        return this;
    }
}
