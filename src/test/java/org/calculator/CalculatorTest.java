package org.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("empty String should retutn 0")
    public void testingEmptyString(){
        assertEquals(0,Calculator.add(""));
    }
}