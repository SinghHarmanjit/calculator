package org.simple.calculator.operations;

import java.math.BigDecimal;

public interface Operation {
    String getOperator();
    public BigDecimal calculate(BigDecimal[] operand1);

}
