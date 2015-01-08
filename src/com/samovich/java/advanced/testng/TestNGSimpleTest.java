/**
 * @file TestNGSimpleTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.samovich.java.advanced.testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class TestNGSimpleTest {

    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }

}
