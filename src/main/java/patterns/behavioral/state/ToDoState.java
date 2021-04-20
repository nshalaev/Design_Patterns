package patterns.behavioral.state;

public class ToDoState extends State {

    public ToDoState(Task task) {
        super(task);
    }

    @Override
    public State nextState() {
        return new InProgressState(getTask());
    }
}
