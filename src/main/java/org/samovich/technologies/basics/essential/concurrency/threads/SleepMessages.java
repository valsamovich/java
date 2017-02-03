/**
 * @file SleepMessages.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/11
 * 
 * The SleepMessage uses sleep to print messages at four-second intervals.
 */

package org.samovich.technologies.basics.essential.concurrency.threads;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException {
            
        String importantInfo[] = {
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
        };

        for (int i = 0; i < importantInfo.length; i++) {
            // Pause for 4 seconds.
            Thread.sleep(4000);
            // Print a message.
            System.out.println(importantInfo[i]);

        }
        
    }
    
}
