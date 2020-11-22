package com.codedifferently.tdd.calculator.calculator.display;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DisplayImplementationTest {

    Display displayImplementation;

    @Before
    public void setUp() {
         displayImplementation = new DisplayImplementation();
    }

    //    BINARY,DECIMAL,HEXADECIMAL,OCTAL

    @Test
    public void testSwitchDisplayModeFromHEXtoOCT() {
        //GIVEN'
        displayImplementation.switchDisplayMode("HEXADECIMAL");
        System.out.println(displayImplementation.getCurrentDisplayMode());
        displayImplementation.switchDisplayMode();

        //WHEN
        String actual = displayImplementation.getCurrentDisplayMode();
        String expected = "OCTAL";
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSwitchDisplayModeFromDECtoHEX() { //
        //GIVEN
        displayImplementation.switchDisplayMode();
        //WHEN
        String actual = displayImplementation.getCurrentDisplayMode();
        String expected = "HEXADECIMAL";
        //THEN
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTestSwitchDisplayModePassInOctal() {
        //GIVEN
        displayImplementation.switchDisplayMode("octal");
        //WHEN
        String actual = displayImplementation.getCurrentDisplayMode();
        String expected = "OCTAL";
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTestSwitchDisplayModePassInHEXADECIMAL() {
        //GIVEN
        displayImplementation.switchDisplayMode("HEXADECIMAL");
        //WHEN
        String actual = displayImplementation.getCurrentDisplayMode();
        //THEN
        Assert.assertTrue(actual == "HEXADECIMAL");
    }

    @Test
    public void testGetCurrentDisplayMode() {
        //GIVEN
        displayImplementation.switchDisplayMode("OCTAL");
        //WHEN
        String actual = displayImplementation.getCurrentDisplayMode();
        //THEN
        Assert.assertEquals("OCTAL", actual);
    }
}