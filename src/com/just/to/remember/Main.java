package com.just.to.remember;

import com.just.to.remember.intro.scaninfo.ScanPractice;
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

        // #2
        SimpleLogger.logToConsole("#2\n" + SEPARATOR);
        ScanPractice.helloScan();
        SimpleLogger.logToConsole(SEPARATOR);
        ScanPractice.tripleShow();
        SimpleLogger.logToConsole(SEPARATOR);
        ScanPractice.shirtOrJacket();
        SimpleLogger.logToConsole(SEPARATOR);
        ScanPractice.whatsTodayDate();
        SimpleLogger.logToConsole(SEPARATOR);
        ScanPractice.eMailing();
        SimpleLogger.logToConsole(SEPARATOR);
    }
}
