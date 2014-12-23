/**
 * @file TestUnit.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/123/2014
 */

package com.valerysamovich.java.advanced.junit.runner;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestUnit {
    
    @Test
    public void testAdd() {
        
        String str = "JUnit is working fine";
        assertEquals("JUnit is working fine", str);
    }
}
