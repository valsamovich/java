/**
 * @file SerializationDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/29
 */

package com.samovich.specialized.jndi.serialization;

import java.io.*;
import java.util.List;

public class SerializationDemo {

    // Serialization method.
    public void serialize(List<Participant> pList, String fileName) {

        // Create in instance of the ObjectOutputStream with try-catch block
        try(ObjectOutputStream out =
                    new ObjectOutputStream(new FileOutputStream(fileName))) {
            // Write object to pList.
            out.writeObject(pList);
        } catch (IOException e) {
            // Print the message.
            System.out.println("A problem occurred during serialization");
            // Print the specific problem.
            System.out.println(e.getMessage());
        }

    }

    // Deserialize method.
    public List<Participant> deserialize(String fileName) {

        // Create a list of Participants.
        List<Participant> pList = null;
        // Create an instance of the ObjectInputStream with try-catch block.
        try (ObjectInputStream in =
                    new ObjectInputStream(new FileInputStream(fileName))) {
            // Read the object and assign to pList.
            pList = (List<Participant>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Print the message.
            System.out.printf("A problem occurred deserializing %s%n", fileName);
            // Print the original message from exception.
            System.out.println(e.getMessage());
        }

        return pList;

    }

}

