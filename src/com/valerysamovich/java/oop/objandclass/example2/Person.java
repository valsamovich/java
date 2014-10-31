package com.valerysamovich.java.oop.objandclass.example2;

public class Person {

    // Instance variables
    String firstName = "Jim";
    String lastName = "Norris";
    int age = 12;

    // Constructor with 3 arguments
    public Person(String a, String b, int myAge) {
        this.firstName = a;
        this.lastName = b;
        this.age = myAge;
    }
    
    void writeName() {
        // Writes the first name
        System.out.println(firstName);

        // Alternatively, combine with strings with +
        System.out.println(firstName + " " + lastName + " is " + age);
    }

}
