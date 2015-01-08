/**
 * To create and execute JUnit test:
 *
 * 1. right click on class, select New -> JUnit Test Case
 * 2. ensure New JUnit 4 test is selected
 * 3. select the methods that must be tested
 * 4. add JUnti library, if is not part of the classpath
 * 5. right click on class and select Run As -> JUnit Test
 *
 */

package com.samovich.java.specialized.junit;

public class MyClass {
    
    public int myltiply(int x, int y) {
        
        // the following is just an example
        if (x > 999) {
            throw new IllegalArgumentException("X should be less than 1000");
        }
        return x * y;
    }
}
