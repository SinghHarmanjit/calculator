package org.simple.calculator.process;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.simple.calculator.operations.MonomialOperation;
import org.simple.calculator.operations.implementations.SubtractionOperation;

import java.math.BigDecimal;

public class CalculatorCommandTest {

    @Test
    void executeBinomial() {
        CalculatorCommand command = new CalculatorCommand(new SubtractionOperation(),
                new BigDecimal[]{BigDecimal.TEN, BigDecimal.TEN});
        Assertions.assertEquals(BigDecimal.ZERO, command.execute());
    }

    @Test
    void executeMonomial() {
        CalculatorCommand command = new CalculatorCommand(new MonomialOperation() {
            @Override
            public BigDecimal calculate(BigDecimal input) {
                return input;
            }

            @Override
            public String getOperator() {
                return null;
            }
        },
                new BigDecimal[]{BigDecimal.TEN});
        Assertions.assertEquals(BigDecimal.TEN, command.execute());
    }
}