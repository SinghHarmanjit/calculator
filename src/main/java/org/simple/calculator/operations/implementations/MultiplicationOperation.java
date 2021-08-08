package org.simple.calculator.operations.implementations;

import org.simple.calculator.operations.BinomialOperation;

import java.math.BigDecimal;

public class MultiplicationOperation implements BinomialOperation {
    @Override
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2) {
        return operand1.multiply(operand2);
    }

    @Override
    public String getOperator() {
        return "*";
    }
}