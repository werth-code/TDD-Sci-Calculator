package com.codedifferently.tdd.calculator.calculator.memory;

public interface Memory {
    void setCurrentValue(Double input);
    void resetMemory();
    Double recallCurrentValue();
}
