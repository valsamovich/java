package com.samovich.java.basics.concepts.objects.object;

// New class - MyNewClass
public class MyNewClass {
    
    // Instance variable var1
    private String myString;
    
    // Constructor with String parameter
    public MyNewClass(String myParameter) {
        
        // Assign value to myStrnig with myParameter
        myString = myParameter;
        // or this.myString = myParameter;
        
    }
    
    // Method doSomething, which does not return a value and has no parameters
    public void doSomething() {
        // Method body
    }
    
    // Method doSomething2, which does not return a value and has 2 parameters
    public void doSmothing2(int myInt, Person person) {
        // Method body
    }
    
    // Method doSomething2, which returns an int value and has 3 parameters
    public int doSomething3(String a, String b, Person person) {
        return 5;
    }
    
}
