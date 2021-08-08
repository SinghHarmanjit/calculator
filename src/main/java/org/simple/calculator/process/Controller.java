package org.simple.calculator.process;

import org.simple.calculator.operations.Operation;
import org.simple.calculator.operations.OperationsFactory;

import java.math.BigDecimal;

public class Controller {
    private OperationsFactory factory = new OperationsFactory();

    public BigDecimal process(String[] allInputs) {
        Operation operation = null;
        BigDecimal[] operands = null;
        if (allInputs.length == 3) {
            operation = factory.getOperationsFor(allInputs[1]);
            BigDecimal operand1 = new BigDecimal(allInputs[0]);
            BigDecimal operand2 = new BigDecimal(allInputs[2]);
            operands = new BigDecimal[] {operand1, operand2};
        }

        CalculatorCommand command = new CalculatorCommand(operation, operands);
        return command.execute();
    }
}
