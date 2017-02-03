/**
 * @file Participant.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/29
 */

package org.samovich.technologies.specialized.jndi.serialization;

import java.io.Serializable;

public class Participant implements Serializable {

    // Fields.
    private final String firstName;
    private final String lastName;
    private int age;

    // Constructor.
    public Participant(String fName, String lName, int a) {

        this.firstName = fName;
        this.lastName = lName;
        this.age = a;
    }

    // Getter method for FirstName.
    public String getFirstName() {
        return firstName;
    }

    // Getter method for LastName.
    public String getLastName() {
        return lastName;
    }

    // Getter method for Age
    public int getAge() {
        return age;
    }

    // Setter method for Age.
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return firstName + " " + lastName + "(" + age + ")";
    }
}
