package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.display.Display;
import com.codedifferently.tdd.calculator.calculator.display.DisplayImp;
import static com.codedifferently.tdd.calculator.utils.CustomConsole.*;

public class BasicCalculatorImp implements Calculator{
    protected Display display;

    public BasicCalculatorImp(){
        this.display = new DisplayImp();
    }

    public void run(){
        String message = "";
        println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", display.getCurrentDisplayValue());
        println(message);
    }

    protected Double add(Double input){
        return 0.0;
    }

    protected Double subtract(Double input){
        return 0.0;
    }

    protected Double multiply(Double input){
        return 0.0;
    }

    protected Double divide(Double input){
        return 0.0;
    }
}
