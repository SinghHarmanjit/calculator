package org.simple.calculator.inout;

import java.io.PrintStream;
import java.math.BigDecimal;

public class OutputUI {
    private PrintStream output;
    public OutputUI(PrintStream output) {
        this.output = output;
    }

    public void getOutput(BigDecimal decimal) {
        output.print("Output: " + decimal);
    }
}
