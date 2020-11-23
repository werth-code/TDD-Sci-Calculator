package com.codedifferently.tdd.calculator.calculator.display;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisplayImplementation implements Display{
    private DisplayMode displayMode;

    public DisplayImplementation(){
        this.displayMode = DisplayMode.DECIMAL;
    }

    //BINARY,DECIMAL,HEXADECIMAL,OCTAL

    @Override
    public void switchDisplayMode() {
        List<DisplayMode> display = new ArrayList<>(Arrays.asList(DisplayMode.values()));
        for(int i = 0; i < display.size(); i++) {
            Integer currentDisplay = display.indexOf(displayMode);
            if(displayMode.equals(display.get(i))) {
                if(display.indexOf(currentDisplay) == display.size() -1) displayMode = display.get(0);
                else displayMode = display.get(i + 1);
                break;
            }
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
        return displayMode.toString();
    }
}
