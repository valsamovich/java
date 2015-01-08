package com.samovich.java.oop.objandclass.example2;

public class MyOtherClass {

    // Private instance variables
    private String myValue;
    private Dog dog;
    
    // Getter method for myValue. Should start with get
    public String getMyValue() {
        return myValue;
    }
    
    // Setter method for myValue. Should start with set
    public void setMyValue (String myValue) {
        this.myValue = myValue;
    }
    
    // Getter method for dog
    public Dog getDog() {
        return dog;
    }
    
    // Setter method for dog
    public void setDog (Dog dog) {
        this.dog = dog;
    }
}
