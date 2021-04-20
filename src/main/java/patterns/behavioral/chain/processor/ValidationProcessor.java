package patterns.behavioral.chain.processor;

import patterns.behavioral.chain.model.SomeObject;

import java.util.Objects;

public class ValidationProcessor extends Processor {

    @Override
    public void process(SomeObject someObject) {
        Objects.requireNonNull(someObject);
        Objects.requireNonNull(someObject.getName());
        Objects.requireNonNull(someObject.getInfo());
        processNext(someObject);
    }
}
