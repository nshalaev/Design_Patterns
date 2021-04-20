package patterns.behavioral.strategy;

import patterns.behavioral.strategy.operation.Operation;

public class Calculator {
    private Operation operation;
    private int operandA;
    private int operandB;

    public Calculator(int operandA, int operandB) {
        this.operandA = operandA;
        this.operandB = operandB;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate() {
        return operation.doOperation(operandA, operandB);
    }
}
