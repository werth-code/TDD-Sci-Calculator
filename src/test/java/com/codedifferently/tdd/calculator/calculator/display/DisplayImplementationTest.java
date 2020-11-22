package com.codedifferently.tdd.calculator.calculator.display;

import com.codedifferently.tdd.calculator.calculator.basic.BasicCalculatorImp;
import com.codedifferently.tdd.calculator.calculator.basic.Calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayImplementationTest {

    Display display;

    @Before
    public void setUp() {
         display = new DisplayImplementation();
    }

    @Test
    public void testSwitchDisplayMode() { //Not sure if this is testing correctly
        //GIVEN
        display.switchDisplayMode("HEXADECIMAL");
        //WHEN
        display.switchDisplayMode();
        String actual = display.getCurrentDisplayMode();
        //THEN
        Assert.assertEquals(actual, "BINARY");
    }

    @Test
    public void testTestSwitchDisplayMode() {
        //GIVEN
        display.switchDisplayMode("OCTAL");
        //WHEN
        String actual = display.getCurrentDisplayMode();
        //THEN
        Assert.assertTrue(actual == "OCTAL");
    }

    @Test
    public void testGetCurrentDisplayMode() {
        //GIVEN
        display.switchDisplayMode("OCTAL");
        //WHEN
        String actual = display.getCurrentDisplayMode();
        //THEN
        Assert.assertEquals(actual, "OCTAL");
    }
}