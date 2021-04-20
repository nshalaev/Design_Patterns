package patterns.behavioral.memento;

public class Memento {
    private final SumAccumulator sumAccumulator;
    private final int backup;

    public Memento(SumAccumulator sumAccumulator) {
        this.sumAccumulator = sumAccumulator;
        this.backup = sumAccumulator.backup();
    }

    public void restore() {
        sumAccumulator.restore(backup);
    }
}
