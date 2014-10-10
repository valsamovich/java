package com.valerysamovich.java.objandclass.example2;

public class Main {

    public static void main(String[] args) {
        
        // Create the new instance of the person class
        Person person = new Person("Henry", "Ford", 36);
        person.writeName();
        
        // Reuse the same variables and assign a new object to it
        person = new Person("Jonny", "Gordon", 50);
        person.writeName();

    }

}
