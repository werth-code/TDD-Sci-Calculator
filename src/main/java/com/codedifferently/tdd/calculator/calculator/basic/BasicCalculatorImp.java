package com.codedifferently.tdd.calculator.calculator.basic;

import com.codedifferently.tdd.calculator.calculator.display.Display;
import com.codedifferently.tdd.calculator.calculator.display.DisplayImplementation;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;

import static com.codedifferently.tdd.calculator.utils.CustomConsole.*;

public class BasicCalculatorImp implements Calculator{
    protected Memory memory;
    protected Display display;

    public BasicCalculatorImp(){
        this.memory = new MemoryImplementation();
        this.display = new DisplayImplementation();
    }

    public void run(){
        String message = "";
        println("Welcome to TDD Calculator");
        message = String.format("The current Value is %d", memory.recallCurrentValue());
        println(message);
    }

    protected Double add(Double input){
        Double sum = memory.recallCurrentValue() + input;
        memory.setCurrentValue(sum);
        return sum;
    }

    protected Double subtract(Double input){
        Double difference = memory.recallCurrentValue() - input;
        memory.setCurrentValue(difference);
        return difference;
    }

    protected Double multiply(Double input){
        Double product = memory.recallCurrentValue() * input;
        memory.setCurrentValue(product);
        return product;
    }

    protected Double divide(Double input){
        Double quotient = memory.recallCurrentValue() / input;
        memory.setCurrentValue(quotient);
        return quotient;
    }

    protected Double sq(Double input){ //Is this correct?
        Double sq = input * input;
        memory.setCurrentValue(sq);
        return sq;
    }

    protected Double sqrt(Double input) {
        Double sqrt = Math.sqrt(input);
        memory.setCurrentValue(sqrt);
        return sqrt;
    }
}
