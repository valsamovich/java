package com.samovich.basics.concepts.classes.finalex;

public class FinalDemo {
    
    
    // final keyword can be applied to data, methods, classes
    // final data is a constant. cannot be changed
    // final methods cannot be overridden
    // final classes cannot be sub classed
    
    final double pi = 3.14;
    
    public void methodA(){
        // pi = 4.0; // cannot be changed
        System.out.println("pi = " + pi);
    }
}
