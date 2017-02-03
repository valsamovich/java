/**
 * @file OddEvenTest.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/03
 */

package org.samovich.technologies.basics.exercises;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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