package com.valerysamovich.java.basics.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testEvenNum() {
        
        boolean answer = true;
        boolean value;
        double num = 6;
        
        value = OddEven.evenNum(num);
        assertEquals(answer, value);
    }

}
