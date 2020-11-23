package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.display.Display;
import com.codedifferently.tdd.calculator.calculator.display.DisplayImplementation;
import com.codedifferently.tdd.calculator.calculator.memory.Memory;
import com.codedifferently.tdd.calculator.calculator.memory.MemoryImplementation;
import com.codedifferently.tdd.calculator.calculator.unit.Unit;

import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class SciCalculator extends BasicCalculatorImp {

    private Unit unit;

    public SciCalculator(){
        this.memory = new MemoryImplementation();
        this.display = new DisplayImplementation();
        this.unit = Unit.DEGREES;
    }

    protected Unit getUnit() {
        return unit;
    }

    protected void switchUnit(Unit unitToSwitchTo) {
        unit = unitToSwitchTo;
    }

    protected void switchUnit() {
        unit = unit.equals(unit.DEGREES) ? Unit.RADIANS : Unit.DEGREES;
    }

    protected Double sine(Double input) {
        Double sine = Math.signum(input);
        return sine;
    }

    protected Double factorial(Double input) {
        Double fact = 1.0;
        for(int i = 2; i <= input; i++) {
            fact = fact * i;
        }
        return fact;
    }

    protected Double invNatLog(Double input) {
        return Math.floor(Math.exp(input) * 100) / 100;
    }

    protected Double natLog(Double input) {
        return Math.log(input);
    }

    protected Double log(Double input) {
        return Math.log10(input);
    }

    protected Double inverseTangent(Double input) {
        return Math.floor(Math.atan(input) * 100) / 100;
    }

    protected Double inverseCosine(Double input) {
        return null;
    }

    protected Double inverseSine(Double input) {
        return null;

    }

    protected Double tangent(Double input) {
        return null;
    }

    protected Double cosine(Double input) {
        return null;

    }
}
