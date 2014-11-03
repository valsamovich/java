/**
 * @file LoggerExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/3/2014
 * 
 * GreetingClient is a client program that connects to a server by using a 
 * socket and send a greeting, and then waits for response.
 */

package com.valerysamovich.java.advanced.logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerExample {
    
    // Create the LOGGER Object
    private static final Logger LOGGER = 
            Logger.getLogger(LoggerExample.class.getName());
    
    public static void main(String[] args) {
        
        LOGGER.info("Logger Name: " + LOGGER.getName());
        LOGGER.warning("Can cause  ArrayIndexOutOfBoundsException");

    }

}
