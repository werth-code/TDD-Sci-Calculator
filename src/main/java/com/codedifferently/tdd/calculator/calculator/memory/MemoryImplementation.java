package com.codedifferently.tdd.calculator.calculator.memory;

public class MemoryImplementation implements Memory{
    private Double currentValue;

    public MemoryImplementation(){
        this.currentValue = 0.0;
    }

    // This will need to be checked before any actions add, subtract, multiply etc
    @Override
    public void setCurrentValue(Double input) {
        this.currentValue = input;
    }

//This can be selected whenever the calculator is turned on/off or if a specific method is pushed.
    @Override
    public void resetMemory() {
        this.currentValue = 0.0;
    }

// after action is taken add subtract etc current value should appear.
    @Override
    public Double recallCurrentValue() {
        return this.currentValue;
    }
}
