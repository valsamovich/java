/**
 * @file TestNGSimpleTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.valerysamovich.java.advanced.testng;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestNGSimpleTest {

    @Test
    public void testAdd() {
        String str = "TestNG is working fine";
        assertEquals("TestNG is working fine", str);
    }

}
