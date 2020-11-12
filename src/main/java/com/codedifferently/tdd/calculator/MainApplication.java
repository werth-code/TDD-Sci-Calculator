package com.codedifferently.tdd.calculator;


import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.basic.Calculator;

public class MainApplication {
    public static void main(String[] args) {
        Calculator calculator = new BasicCalculatorImp();
        calculator.run();
    }
}
