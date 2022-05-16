package com.just.to.remember;

import com.just.to.remember.intro.variables.Vars;
import com.just.to.remember.utils.SimpleLogger;

public class Main {
    private static final String SEPARATOR = "--------------------";
    public static void main(String[] args) {
        // #1
        SimpleLogger.logToConsole("#1\n" + SEPARATOR);
        Vars.assignAndShow();
        SimpleLogger.logToConsole(SEPARATOR);
        Vars.assignAndShow2();
        SimpleLogger.logToConsole(SEPARATOR);
        Vars.somePersonInfo();
        SimpleLogger.logToConsole(SEPARATOR);

    }
}
