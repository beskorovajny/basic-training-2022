package com.just.to.remember.intro.variables;

import com.just.to.remember.utils.SimpleLogger;

public class Vars {
    public static void assignAndShow() {
        int oneH = 100;
        int twoH = 200;
        int threeH = 300;
        SimpleLogger.logToConsole("" + oneH + "\n" + twoH + "\n" + threeH
                + "\n" + oneH + " " + twoH + " " + threeH);
    }
    public static void assignAndShow2() {
        int year = 2021;
        double pI = 3.1415;
        String topLang = "Java";
        boolean yOrN = 7 > 5;
        SimpleLogger.logToConsole(year + "\n" + pI + "\n" + topLang + "\n" + yOrN);
    }
    public static void somePersonInfo() {
        String name = "John";
        int age = 23;
        double height = 1.92;
        SimpleLogger.logToConsole(name + "\n" + age + "\n" + height);
    }

}
