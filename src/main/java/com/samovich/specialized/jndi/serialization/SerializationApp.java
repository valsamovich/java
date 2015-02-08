/**
 * @file SerializationApp.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/29
 */

package com.samovich.specialized.jndi.serialization;

import java.util.List;
import java.util.ArrayList;

public class SerializationApp {

    public static void main(String[] args) {

        // Create the list of participants.
        List<Participant> participant = new ArrayList<Participant>();

        // Add the new participants.
        participant.add(new Participant("Ben", "Smith", 17));
        participant.add(new Participant("Melinda", "Green", 20));
        participant.add(new Participant("Michael", "Thomas", 21));
        participant.add(new Participant("Julia", "Webster", 19));

        // Display the "Participants" output.
        System.out.println("Participant" + participant);

        // Create a instance of the SerializationDemo
        SerializationDemo demo = new SerializationDemo();
        // Serialize the participants.
        demo.serialize(participant,
                "src/main/resources/com/samovich/specialized/jndi/serialization/Participants.ser");

        // Display the string message.
        System.out.println("Serialization is done!");

        List<Participant> newList = demo.deserialize(
                "src/main/resources/com/samovich/specialized/jndi/serialization/Participants.ser");

        System.out.println("New List: " + newList);

        // Display the string message.
        System.out.println("Deserialization is done!");
    }

}
