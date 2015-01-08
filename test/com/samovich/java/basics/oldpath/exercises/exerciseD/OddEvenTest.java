package com.samovich.java.basics.oldpath.exercises.exerciseD;

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
