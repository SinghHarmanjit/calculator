package org.simple.calculator.operations;

import java.math.BigDecimal;

public interface MonomialOperation extends Operation {
    public BigDecimal calculate(BigDecimal input);
}
