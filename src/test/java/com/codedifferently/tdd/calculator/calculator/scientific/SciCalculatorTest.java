package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.unit.Unit;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SciCalculatorTest {
    SciCalculator sciCalculator;

    @Before
    public void setup() {
        sciCalculator = new SciCalculator();
    }

    @Test
    public void testGetUnit() {
        //Given
        Unit expectedUnit = Unit.DEGREES;
        //When
        sciCalculator.switchUnit(expectedUnit);
        //Then
        Assert.assertEquals(sciCalculator.getUnit(), expectedUnit);
    }

    @Test
    public void testSwitchUnit() {
        //Given
        Unit expectedUnit = Unit.RADIANS;
        //When
        sciCalculator.switchUnit(expectedUnit);
        //Then
        Assert.assertEquals(sciCalculator.getUnit(), expectedUnit);
    }

    @Test
    public void testSwitchModeToggle() {
        Unit expectedUnit = Unit.DEGREES;
        sciCalculator.switchUnit(Unit.RADIANS);
        sciCalculator.switchUnit();
        Assert.assertEquals(sciCalculator.getUnit(), expectedUnit);

    }

    @Test
    public void testSine() { //IS THIS CORRECT?
        //GIVEN
        Double expectedSine = 1.00;
        Double sineInput = 9.00;
        //WHEN we call our method 'sine'
        Double actualSine = sciCalculator.sine(sineInput);
        //THEN -- they should be the same
        Assert.assertEquals(expectedSine, actualSine);
    }

    @Test
    public void testFactorial() {
        //GIVEN we have an expected sine with an input
        Double expectedFactorial = 5040.00;
        // 7! 7*6*5*4*3*2*1 = 5040
        Double factorialInput = 7.00;
        //WHEN we call our method 'factorial'
        Double actualFactorial = sciCalculator.factorial(factorialInput);
        //THEN
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testFactorial2() {
        //GIVEN we have an expected sine with an input
        Double expectedFactorial = 24.00;
        // 4! 4*3*2*1 = 24
        Double factorialInput = 4.00;
        //WHEN we call our method 'factorial'
        Double actualFactorial = sciCalculator.factorial(factorialInput);
        //THEN
        Assert.assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testInvNatLog() { ///!!!!!!!!
        Double expectedInvNatLog = 148.41;
        Double invNatLogInput = 5.00;
        Double actualInvNatLog = sciCalculator.invNatLog(invNatLogInput);
        Assert.assertEquals(expectedInvNatLog, actualInvNatLog);
    }

    @Test
    public void testNatLog() {
        Double expectedNatLog = 1.0;
        Double natLogInput = Math.E;
        Double actualNatLog = sciCalculator.natLog(natLogInput);
        Assert.assertEquals(expectedNatLog, actualNatLog);
    }


    @Test
    public void testLog() {
        Double expectedLog = 1.00;
        Double LogInput = 10.00;
        Double actualLog = sciCalculator.log(LogInput);
        assertEquals(expectedLog, actualLog);
    }

    @Test
    public void testInverseTangent() { //!!!!!!!!!
        Double expectedInverseTangent = 1.47;
        Double InverseTangentInput = 10.00;
        Double actualInverseTangent = sciCalculator.inverseTangent(InverseTangentInput);
        Assert.assertEquals(expectedInverseTangent, actualInverseTangent);

    }

    @Test
    public void testInverseCosine() {
        Double expectedInverseCosine = 3.14;
        Double InverseCosineInput = -1.00;
        Double actualInverseCosine = sciCalculator.inverseCosine(InverseCosineInput);
        Assert.assertEquals(expectedInverseCosine, actualInverseCosine);
    }

    @Test
    public void testInverseSine() {
        Double expectedInverseSine = 1.57;
        Double InverseSineInput = 1.00;
        Double actualInverseSine = sciCalculator.inverseSine(InverseSineInput);
        assertEquals(expectedInverseSine, actualInverseSine);
    }

    @Test
    public void testTangent() {
        Double expectedTangent = 1.55;
        Double TangentInput = 1.00;
        Double actualTangent = sciCalculator.tangent(TangentInput);
        assertEquals(expectedTangent, actualTangent);
    }

    @Test
    public void testCosine() {
        Double expectedCosine = 0.54;
        Double CosineInput = 1.00;
        Double actualCosine = sciCalculator.cosine(CosineInput);
        assertEquals(expectedCosine, actualCosine);
    }
}