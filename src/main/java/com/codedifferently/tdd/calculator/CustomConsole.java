package com.codedifferently.tdd.calculator;

import java.util.Scanner;


public class CustomConsole {

    private static Scanner scanner = new Scanner(System.in);

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        println(prompt);
        Integer userInput = scanner.nextInt();
        scanner.next();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;
    }
}
