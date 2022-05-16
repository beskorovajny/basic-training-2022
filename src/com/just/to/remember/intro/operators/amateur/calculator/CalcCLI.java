package com.just.to.remember.intro.operators.amateur.calculator;

import com.just.to.remember.utils.SimpleLogger;

import java.util.Scanner;

public class CalcCLI {
    private static final String FIRST_N = "First number :";
    private static final String SECOND_N = "Second number :";
    private static final String RESULT = "Result is : ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char power;
        do {
            int first;
            int second;
            SimpleLogger.logToConsole("Calculator is ready. Choose the operation : \n" +
                    " 1) Sum \n 2) Subtraction \n 3) Multiplication \n 4) Division");
            int choice = scanner.nextInt();
            SimpleLogger.logToConsole(FIRST_N);
            first = scanner.nextInt();
            SimpleLogger.logToConsole(SECOND_N);
            second = scanner.nextInt();
            switch (choice) {
                case (1):
                    SimpleLogger.logToConsole(RESULT + Calculator.sum(first, second));
                    break;
                case (2):
                    SimpleLogger.logToConsole(RESULT + Calculator.subtract(first, second));
                    break;
                case (3):
                    SimpleLogger.logToConsole(RESULT + Calculator.multiply(first, second));
                    break;
                case (4):
                    try {
                        SimpleLogger.logToConsole(RESULT + Calculator.division(first, second));
                    }catch (ArithmeticException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    SimpleLogger.logToConsole("No such command");
                    break;
            }
            SimpleLogger.logToConsole("One more operation? y/n");
            power = scanner.next().toLowerCase().charAt(0);
        } while (power == 'y');
        SimpleLogger.logToConsole("Powered off...");
    }
}
