package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class History {

    private final List<Memento> history;
    private int virtualSize;

    public History() {
        this.history = new ArrayList<>();
    }

    public void push(Memento memento) {
        this.history.add(memento);
        this.virtualSize = history.size() - 1;
    }

    public void undo() {
        getUndo().ifPresent(
                Memento::restore
        );
    }

    public void redo() {
        getRedo().ifPresent(
                Memento::restore
        );
    }

    private Optional<Memento> getUndo() {
        virtualSize = Math.max(0, virtualSize - 1);
        return Optional.ofNullable(
                history.get(virtualSize)
        );
    }

    private Optional<Memento> getRedo() {
        virtualSize = Math.min(history.size() - 1, virtualSize + 1);
        return Optional.ofNullable(
                history.get(virtualSize)
        );
    }
}
