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
        if (operation instanceof BinomialOperation){
            return ((BinomialOperation) operation).calculate(operands[0], operands[1]);
        } else if (operation instanceof MonomialOperation) {
            return ((MonomialOperation) operation).calculate(operands[0]);
        }

        return null;
    }
}
