package org.simple.calculator.inout;

import java.io.InputStream;
import java.util.Scanner;

public class InputUI {
    public static final String BLANK = " ";
    private InputStream stream;
    public InputUI(InputStream stream) {
        this.stream = stream;
    }

    public String[] getInput() {
        System.out.print("Input: ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        return input.split(BLANK);
    }
}
