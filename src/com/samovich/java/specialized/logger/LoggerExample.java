/**
 * @file LoggerExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/3/2014
 * 
 * Example of logger class with LOGGER object which is used to log messages.
 */

package com.samovich.java.specialized.logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerExample {
    
    // Create the LOGGER Object using getLogger static method
    private static final Logger LOGGER = 
            Logger.getLogger(LoggerExample.class.getName());
    
    public static void main(String[] args)  throws SecurityException, IOException {
        
        // LOGGER message to find logger by the name as a parameter
        LOGGER.info("Logger Name: " + LOGGER.getName());
        // This instance method is used to log a WARNING message
        LOGGER.warning("Can cause  ArrayIndexOutOfBoundsException");

        // An array of the size 3
        int[] a = {1, 2, 3};
        int index = 4;
        LOGGER.config("Index is set to" + index);
        
        try {
            System.out.println(a[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            LOGGER.log(Level.SEVERE, "Exception occur", e);
        }
    }

}
