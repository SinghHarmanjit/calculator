package org.simple.calculator;

import org.simple.calculator.inout.InputUI;
import org.simple.calculator.inout.OutputUI;
import org.simple.calculator.process.Controller;

import java.math.BigDecimal;

public class Calculator {
    private final Controller controller = new Controller();
    private final InputUI input = new InputUI(System.in);
    private final OutputUI output = new OutputUI(System.out);

    public static void main(String args[]) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    public void start() {
        String[] allInputs = input.getInput();
        BigDecimal outputs = controller.process(allInputs);
        output.getOutput(outputs);
    }
}
