package com.codedifferently.tdd.calculator.calculator.basic;

import org.junit.Assert;
import org.junit.Test;

public class BasicCalculatorImpTest {


    @Test
    public void testAdd() throws Exception {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);
        //When
        Double actual = basicCalculatorImp.add(3.0);
        Double expected = 8.0;
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSubtract() throws Exception {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);
        //When
        Double actual = basicCalculatorImp.subtract(3.0);
        Double expected = 2.0;
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testMultiply() throws Exception {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);
        //When
        Double actual = basicCalculatorImp.multiply(5.0);
        Double expected = 25.0;
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testDivide() {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(4.0);
        //When
        Double actual = basicCalculatorImp.divide(2.0);
        Double expected = 2.0;
        Assert.assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testSq() {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        basicCalculatorImp.memory.setCurrentValue(5.0);
        //When
        Double actual = basicCalculatorImp.sq(5.0);
        Double expected = 25.0;
        Assert.assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testSqrt() {
        //Given
        BasicCalculatorImp basicCalculatorImp = new BasicCalculatorImp();
        //When
        Double actual = basicCalculatorImp.sqrt(25.0);
        Double expected = 5.0;
        Assert.assertEquals(expected, actual, 0.0);
    }

}