package com.samovich.basics.exercises.exerciseD;

import static org.junit.Assert.assertEquals;

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
