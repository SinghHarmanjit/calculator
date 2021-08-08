package org.simple.calculator.operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationsFactoryTest {
    private OperationsFactory factory = new OperationsFactory();

    @Test
    void getOperationsFor() {
        Assertions.assertEquals("+", factory.getOperationsFor("+").getOperator());
        Assertions.assertEquals("*", factory.getOperationsFor("*").getOperator());
    }
}