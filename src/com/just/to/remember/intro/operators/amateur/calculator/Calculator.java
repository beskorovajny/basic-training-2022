package com.just.to.remember.intro.operators.amateur.calculator;

public class Calculator {
    private Calculator(){}
    public static double sum(double first, double second) {
        return first + second;
    }

    public static double subtract(double first, double second) {
        return first - second;
    }

    public static double multiply(double first, double second) {
        return first * second;
    }

    public static double division(double first, double second) {
        if (second == 0) {
            throw new ArithmeticException();
        }
        return first / second;
    }
}
