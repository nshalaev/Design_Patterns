package patterns.behavioral.chain.processor;

import patterns.behavioral.chain.model.SomeObject;

import java.util.Objects;

public abstract class Processor {

    private Processor next;

    public Processor linkedWith(Processor processor) {
        this.next = processor;
        return next;
    }

    public void processNext(SomeObject someObject) {
        if (Objects.nonNull(next)) {
            next.process(someObject);
        }
    }

    public abstract void process(SomeObject someObject);

}
