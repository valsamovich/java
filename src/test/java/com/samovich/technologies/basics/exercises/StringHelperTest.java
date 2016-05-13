/**
 * @file StringHelperTest.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/03
 */

package com.samovich.basics.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringHelperTest {

    @Test
    public void testTruncateAInFirstTwoPositions() {

        // Create the new StringHelper object
        StringHelper stringHelper = new StringHelper();

        // Create the var and Call the method for test with String Value
        String actualValue = stringHelper.truncateAInFirstTwoPositions("BACD");
        // Create the var and assign the value
        String expectedValue = "BCD";

        // Assert the values by assertEquals() method
        assertEquals(actualValue, expectedValue);
        
    }
}