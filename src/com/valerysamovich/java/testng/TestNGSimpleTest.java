/**
 * @file TestNGSimpleTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.valerysamovich.java.testng;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestNGSimpleTest {
    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }

}
