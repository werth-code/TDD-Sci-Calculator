package com.codedifferently.tdd.calculator.calculator.scientific;

import com.codedifferently.tdd.calculator.calculator.unit.Unit;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SciCalculatorTest {
    SciCalculator sciCalculator;
    private long expectedFactorial;
    private long expectedInverseCosine;

    @Before
    public void setup() {
        sciCalculator = new SciCalculator();
    }

    @Test
    public void testSine() {
        //GIVEN we have an expected sine with an input
        Double expectedSine = 0.00;
        Double sineInput = 9.00;
        //WHEN we call our method 'sine' to produce an actual result
        Double actualSine = sciCalculator.sine(sineInput);
        //THEN -- they should be the same
        assertEquals(expectedSine, actualSine);
    }

    @Test
    public void testSwitchUnit() {
        Unit expectedUnit = Unit.DEGREES;
        sciCalculator.switchUnit(expectedUnit);
        assertEquals(sciCalculator.getUnit(), expectedUnit);
    }

    @Test
    public void testSwitchModeToggle() {
        Unit expectedUnit = Unit.DEGREES;
        sciCalculator.switchUnit(Unit.RADIANS);
        sciCalculator.switchUnit();
        assertEquals(sciCalculator.getUnit(), expectedUnit);

    }

    @Test
    public void testFactorial() {
        //GIVEN we have an expected sine with an input
        Double expectedFactorial = 0.00;
        Double factorialInput = 9.00;
        //WHEN we call our method 'factorial' to produce an actual result
        Double actualFactorial = sciCalculator.factorial(factorialInput);
        //THEN -- they should be the same
        assertEquals(expectedFactorial, actualFactorial);
    }

    @Test
    public void testInvNatLog() {
        Double expectedInvNatLog = 0.00;
        Double invNatLogInput = 9.00;
        Double actualInvNatLog = sciCalculator.invNatLog(invNatLogInput);
        assertEquals(expectedInvNatLog, actualInvNatLog);
    }

        @Test
            public void testNatLog() {
            Double expectedNatLog = 0.00;
            Double natLogInput = 9.00;
            Double actualNatLog = sciCalculator.invNatLog(natLogInput);
            assertEquals(expectedNatLog, actualNatLog);
        }


    @Test
    public void testLog() {
        Double expectedLog = 0.00;
        Double LogInput = 9.00;
        Double actualLog = sciCalculator.log(LogInput);
        assertEquals(expectedLog, actualLog);
    }

    @Test
    public void testInverseTangent() {
        Double expectedInverseTangent = 0.00;
        Double InverseTangentInput = 9.00;
        Double actualInverseTangent = sciCalculator.inverseTangent(InverseTangentInput);
        assertEquals(expectedInverseTangent, actualInverseTangent);

    }

    @Test
    public void testInverseCosine() {
        Double expectedInverseCosine = 0.00;
        Double InverseCosineInput = 9.00;
        Double actualInverseCosine = sciCalculator.inverseCosine(InverseCosineInput);
        assertEquals(expectedInverseCosine, actualInverseCosine);
    }

    @Test
    public void testInverseSine() {
        Double expectedInverseSine = 0.00;
        Double InverseSineInput = 9.00;
        Double actualInverseSine = sciCalculator.inverseSine(InverseSineInput);
        assertEquals(expectedInverseSine, actualInverseSine);
    }

    @Test
    public void testTangent() {
        Double expectedTangent = 0.00;
        Double TangentInput = 9.00;
        Double actualTangent = sciCalculator.tangent(TangentInput);
        assertEquals(expectedTangent, actualTangent);
    }

    @Test
    public void testCosine() {
        Double expectedCosine = 0.00;
        Double CosineInput = 9.00;
        Double actualCosine = sciCalculator.cosine(CosineInput);
        assertEquals(expectedCosine, actualCosine);
    }
}