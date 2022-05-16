package com.just.to.remember.intro.scaninfo;

import com.just.to.remember.utils.SimpleLogger;

import java.util.Scanner;

public class ScanPractice {
    private static Scanner sc = new Scanner(System.in);
    public static void helloScan() {
        SimpleLogger.logToConsole("Insert your name :");
        String name = sc.nextLine();
        SimpleLogger.logToConsole("Hello, " + name);
    }
    public static void tripleShow() {
        SimpleLogger.logToConsole("Insert some message :");
        String inputStr = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            SimpleLogger.logToConsole(inputStr);
        }
    }
    public static void shirtOrJacket() {
        SimpleLogger.logToConsole("Insert today's temperature :");
        int temperature = sc.nextInt();
        SimpleLogger.logToConsole("The temperature today is: " + temperature + " degrees");
    }
    public static void whatsTodayDate() {
        SimpleLogger.logToConsole("Insert year :");
        int year = sc.nextInt();
        SimpleLogger.logToConsole("Insert month :");
        int month = sc.nextInt();
        SimpleLogger.logToConsole("Insert day :");
        int day = sc.nextInt();
        SimpleLogger.logToConsole(String.format("%02d:%02d:%04d", day, month, year));
    }
    public static void eMailing() {
        sc.nextLine();
        SimpleLogger.logToConsole("Insert your name :");
        String userName = sc.nextLine();
        SimpleLogger.logToConsole("Insert assistant name :");
        String assistantName = sc.nextLine();
        SimpleLogger.logToConsole("Insert messages count :");
        int messageCount = sc.nextInt();
        SimpleLogger.logToConsole("Morning, " + userName +
                ", it's your personal assistant " + assistantName +
                ".\nYou have " + messageCount + " new messages.");
    }
}
