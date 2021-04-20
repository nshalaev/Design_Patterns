package patterns.behavioral.memento;

public class SumAccumulator {

    private final History history;
    private int accumulator;

    public SumAccumulator() {
        this.accumulator = 0;
        this.history = new History();
        this.history.push(new Memento(this));
    }

    public void add(int a) {
        this.accumulator += a;
        history.push(new Memento(this));
    }

    public int getAccumulator() {
        return accumulator;
    }

    public int backup() {
        return getAccumulator();
    }

    public void restore(int backup) {
        this.accumulator = backup;
    }

    public void undo() {
        this.history.undo();
    }

    public void redo() {
        this.history.redo();
    }
}
