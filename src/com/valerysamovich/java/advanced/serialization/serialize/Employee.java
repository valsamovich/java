/**
 * @file Employee.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.valerysamovich.java.advanced.serialization.serialize;

/**
 * Employee class, which emplements the Serializable interface
 */
public class Employee implements java.io.Serializable{
    
    // Variables
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    
    /**
     * Prints the mailer info
     */
    public void mailCheck() {
        System.out.println("Mailing a check to " + name + " " + address);
    }
}
