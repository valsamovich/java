/**
 * @file OddEvenTest.java
 * @author Valery Samovich
 * @version 2
 * @date 2015/01/21
 */

package com.samovich.basics.exercises;

import static org.junit.Assert.assertEquals;
import com.samovich.basics.exercises.OddEven;
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
