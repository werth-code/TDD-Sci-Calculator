package com.codedifferently.tdd.calculator.calculator.display;

public interface Display {
    void switchDisplayMode();
    void switchDisplayMode(String mode);
    String getCurrentDisplayMode();
}
