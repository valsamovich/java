

package com.valerysamovich.java.advanced.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {
    
    @Test (expected  = IllegalArgumentException.class)
    public void testExceptionIsThrown() {
        MyClass tester = new MyClass();
        tester.myltiply(1000, 5);
    }
    
    @Test
    public void testMyltiply() {
        MyClass tester = new MyClass();
        assertEquals("10 x 5 must be 50", 50, tester.myltiply(10, 5));
    }
    
}
