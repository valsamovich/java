package com.valerysamovich.java.basic.operators.conditional.instance;

public class InstanceofExample {

    public static void main(String[] args) {
        
        // variables
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        // instanceof operator compares an object to a specific type
        System.out.println("obj1 instance of Parent: " 
                + (obj1 instanceof Parent));

        System.out.println("obj1 instance of Child: " 
                + (obj1 instanceof Child));

        System.out.println("obj1 instance of MyInterface: " 
                + (obj1 instanceof MyInterface));
        
        System.out.println("obj2 instance of Parent: " 
                + (obj2 instanceof Parent));

        System.out.println("obj2 instance of Child: " 
                + (obj2 instanceof Child));

        System.out.println("obj2 instance of MyInterface: " 
                + (obj2 instanceof MyInterface));
    }
    
}
