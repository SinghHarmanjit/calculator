package org.simple.calculator.operations.implementations;

import org.simple.calculator.operations.BinomialOperation;

import java.math.BigDecimal;

public class MultiplicationOperation implements BinomialOperation {
    @Override
    public BigDecimal calculate(BigDecimal[] operands) {
        return operands[0].multiply(operands[1]);
    }

    @Override
    public String getOperator() {
        return "*";
    }
}
