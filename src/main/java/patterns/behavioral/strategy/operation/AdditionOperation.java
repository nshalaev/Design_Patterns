package patterns.behavioral.strategy.operation;

public class AdditionOperation implements Operation {

    @Override
    public int doOperation(int operandA, int operandB) {
        return operandA + operandB;
    }
}
