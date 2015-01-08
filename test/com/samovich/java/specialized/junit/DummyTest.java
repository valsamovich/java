/**
 * @file Dummytest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/5/2014
 *
 * AssertThat example.
 */

package com.samovich.java.specialized.junit;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DummyTest {
    @Test
    public void something() {
        Assert.assertFalse(true);
    }
}