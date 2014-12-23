/**
 * @file TestRunner.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/23/2014
 */

package com.valerysamovich.java.advanced.junit.runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        
        Result result = JUnitCore.runClasses(TestUnit.class);
        
        for(Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
