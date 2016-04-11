/**
 * @author samov004
 * @version 1.0.0
 * @file CalculateTest.java
 * @date 4/11/16
 */

package com.samovich.specialized.junit.assertion;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {

    Calculate calculation = new Calculate();
    int sum  = calculation.sum(2, 5);
    int testSum = 7;

    @Test
    public void sum() throws Exception {
        System.out.println("@Test sum(): " + sum + " = " + testSum);
        assertEquals(sum, testSum);
    }

}