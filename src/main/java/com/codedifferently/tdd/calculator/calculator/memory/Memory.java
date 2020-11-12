package com.codedifferently.tdd.calculator.calculator.memory;

public interface Memory {
    void addToCurrentValue(Double input);
    void resetMemory();
    Double recallCurrentValue();
}
