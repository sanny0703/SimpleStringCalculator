package org.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("empty String should return 0")
    public void testEmptyString(){
        assertEquals(0,Calculator.add(""));
    }
    @Test
    @DisplayName("Testing one number")
    public void testOneNumber(){
        assertEquals(1,Calculator.add("1"));
    }
    @Test
    @DisplayName("Testing Two numbers")
    public void testTwoNumbers(){
        assertEquals(3,Calculator.add("1,2"));

    }
    @Test
    @DisplayName("Testing more than two numbers")
    public void testMoreThanTwoNumbers(){
        assertEquals(6,Calculator.add("0,1,2,3"));
    }
    @Test
    @DisplayName("Testing new line as delimiter along with comma")
    public void testNewLine(){
        assertEquals(6,Calculator.add("0\n1\n2,3"));
    }
    @Test
    @DisplayName("Testing if delimiter is specified at the start of the String")
    public void testDelimiterSpecified(){
        assertEquals(6,Calculator.add("//#\n0#1#2#3"));

    }

}