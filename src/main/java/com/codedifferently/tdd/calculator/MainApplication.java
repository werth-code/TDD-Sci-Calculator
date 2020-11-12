package com.codedifferently.tdd.calculator;


public class MainApplication {
    public static void main(String[] args) {
        CustomConsole.println("Welcome to my calculator!");
        String s = CustomConsole.getStringInput("Enter a string");
        Integer i = CustomConsole.getIntegerInput("Enter an integer");
        Double d = CustomConsole.getDoubleInput("Enter a double.");

        CustomConsole.println("The user input %s as a string", s);
        CustomConsole.println("The user input %s as a integer", i);
        CustomConsole.println("The user input %s as a d", d);
    }
}
