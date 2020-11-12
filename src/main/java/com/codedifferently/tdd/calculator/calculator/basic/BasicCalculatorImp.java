package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.*;

public class BasicCalculatorImp implements Calculator{
    protected Memory memory;

    public BasicCalculatorImp(){
        this.memory = new MemoryImplementation();
    }

    public void run(){
        String message = "";
        println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
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

    protected Double sq(Double input){
        return 0.0;
    }

    protected Double sqrt(Double input) {
        return 0.0;
    }
}
