/**
 * @file FooTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/23/2014
 */

package com.valerysamovich.java.advanced.junit;

import org.junit.Ignore;
import org.junit.Test;

/*
 * Tests for {@link Foo}.
 */
public class FooTest {
    
    @Test
    public void thisAlwaysPasses() {
    }
    
    @Test
    @Ignore
    public void thisIsIgnored() {
    }
}

