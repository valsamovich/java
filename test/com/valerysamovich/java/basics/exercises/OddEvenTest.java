package com.valerysamovich.java.basics.exercises;

import static org.junit.Assert.*;

import org.junit.Test;

import com.valerysamovich.java.basic.exercises.exerciseD.OddEven;

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
