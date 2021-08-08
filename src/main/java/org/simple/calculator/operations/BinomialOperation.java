package org.simple.calculator.operations;

import java.math.BigDecimal;

public interface BinomialOperation extends Operation {
    public BigDecimal calculate(BigDecimal operand1, BigDecimal operand2);
}
