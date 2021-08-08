package org.simple.calculator.operations.implementations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.simple.calculator.operations.BinomialOperation;

import java.math.BigDecimal;

public class AdditionOperationTest {
    BinomialOperation operation = new AdditionOperation();

    @Test
    public void test_addition_of_positive_values() {
        BigDecimal value = operation.calculate(
                new BigDecimal("101.123456781"),
                new BigDecimal("100.11111111"));
        Assertions.assertEquals(new BigDecimal("201.234567891"), value);
    }

    @Test
    public void test_addition_of_negative_values() {
        BigDecimal value = operation.calculate(
                new BigDecimal("-1.3000000020"),
                new BigDecimal("-3.4000000010"));
        Assertions.assertEquals(new BigDecimal("-4.7000000030"), value);
    }

    @Test
    public void test_addition_of_zero_values() {
        BigDecimal value = operation.calculate(
                new BigDecimal("0.0"), new BigDecimal("0.0"));
        Assertions.assertEquals(new BigDecimal("0.0"), value);
    }
}