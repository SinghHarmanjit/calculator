package org.simple.calculator.operations.implementations;

import org.simple.calculator.operations.BinomialOperation;

import java.math.BigDecimal;

public class SubtractionOperation implements BinomialOperation {
    @Override
    public BigDecimal calculate(BigDecimal[] operands) {
        return operands[0].subtract(operands[1]);
    }

    @Override
    public String getOperator() {
        return "-";
    }
}
