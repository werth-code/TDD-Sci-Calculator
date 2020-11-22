package com.codedifferently.tdd.calculator.calculator.display;

import java.util.Arrays;

public class DisplayImplementation implements Display{
    private DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;
    }

    @Override
    public void switchDisplayMode() {
        DisplayMode[] values = DisplayMode.values();
        for(int i = 0; i < values.length; i++) {
            if(values[i] == values[values.length -1]) displayMode = values[0];
            else displayMode = values[i + 1];
        }
    }

    @Override
    public void switchDisplayMode(String mode) {
        DisplayMode[] values = DisplayMode.values();
        for (int i = 0; i < values.length; i++) {
            if (mode.equalsIgnoreCase(values[i].toString())) displayMode = values[i];
        }
    }

    @Override
    public String getCurrentDisplayMode() {
        System.out.println(displayMode.toString());
        return displayMode.toString();
    }
}
