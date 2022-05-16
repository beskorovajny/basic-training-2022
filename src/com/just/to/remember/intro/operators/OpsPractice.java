package com.just.to.remember.intro.operators;

import com.just.to.remember.utils.SimpleLogger;

import java.util.Scanner;

public class OpsPractice {
    private static Scanner sc = new Scanner(System.in);
    public static void doPow() {
        SimpleLogger.logToConsole("Enter the number :");
        int n = sc.nextInt();
        SimpleLogger.logToConsole(n + " " + (int)Math.pow(n, 2) + " " + (int)Math.pow(n, 3));
    }
    public static void get24FormatTime() {
        SimpleLogger.logToConsole("Seconds :");
        int secondsTotal = sc.nextInt();
        int hours = (secondsTotal % (24 * 60 * 60)) / 3600;
        int minutes = (secondsTotal % 3600) / 60;
        int seconds = secondsTotal % 60;
        SimpleLogger.logToConsole(String.format("%02d:%02d:%02d", hours, minutes, seconds));
    }
}
