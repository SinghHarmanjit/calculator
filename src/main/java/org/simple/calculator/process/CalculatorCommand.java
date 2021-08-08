package org.simple.calculator.process;

import org.simple.calculator.operations.BinomialOperation;
import org.simple.calculator.operations.MonomialOperation;
import org.simple.calculator.operations.Operation;

import java.math.BigDecimal;

public class CalculatorCommand {
    private Operation operation;
    private BigDecimal[] operands;

    public CalculatorCommand(Operation operation, BigDecimal[] operands) {
        this.operation = operation;
        this.operands = operands;
    }

    public BigDecimal execute() {
        return operation.calculate(operands);
    }
}
