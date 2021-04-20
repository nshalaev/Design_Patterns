package patterns.behavioral.strategy.operation;

public class SubtractionOperation implements Operation {

    @Override
    public int doOperation(int operandA, int operandB) {
        return operandA - operandB;
    }
}
