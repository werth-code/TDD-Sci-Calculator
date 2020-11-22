package com.codedifferently.tdd.calculator.calculator.memory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MemoryImplementationTest {
// MemoryImplementation (object) memoryImplementation (name of object)
    private MemoryImplementation memoryImplementation;

    @Before
//  new ( is actually creating the object)
    public void setUp()  {memoryImplementation = new MemoryImplementation(); }

    @Test
    public void setCurrentValueTest() {
        Double expected = 7.7;
//  .setCurrentValue is the method calling on the name of the object(memoryImplementation)
        memoryImplementation.setCurrentValue(expected);
//  returns current value
        Double actual = memoryImplementation.recallCurrentValue();
//  assert equals is determining if expected and actual are the same.
//  This method is tied to line 13 on the tab (MemoryImplementation.java)
//  comment it out to make the test fail.
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void resetMemory() {
        Double expected = 0.0;
        memoryImplementation.resetMemory();
        Double actual = memoryImplementation.recallCurrentValue();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void recallCurrentValue() {
        Double expected = 0.0;
        Double actual = memoryImplementation.recallCurrentValue();
        Assert.assertEquals(expected, actual);
    }
}

