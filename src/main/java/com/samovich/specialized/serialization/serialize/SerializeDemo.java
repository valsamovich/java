/**
 * @file SerializeDemo.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.samovich.specialized.serialization.serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main(String[] args) {
        
        // Create the instance of the Employee object
        Employee e  = new Employee();
        e.name ="John Doe";
        e.address = "Florida, USA";
        e.SSN = 1112223333;
        e.number = 101;
        
        try {
           FileOutputStream fileOut =
           new FileOutputStream("/tmp/employee.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(e);
           out.close();
           fileOut.close();
           System.out.printf("Serialized data is saved in /tmp/employee.ser");
        } catch(IOException i) {
            i.printStackTrace();
        }

    }

}
