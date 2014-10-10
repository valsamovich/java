package com.valerysamovich.java.constructors.example1;

public class SmallBox {
	
	int length;
	int width;
	
	// constructor is a method that has the same name as the class.
	// it is executed when an object is created.
	// it is used to set default values.
	// does not return anything including void.
	
	// constructor method
	SmallBox(){ 
		this.length = 5;
		this.width = 6;
		System.out.println("Constructor fired");
	}
	
	// constructor method with parameters
	SmallBox(int length, int width){ 
		this.length = length;
		this.width = width;
	}
	
	void calculateArea(){
		System.out.println("Area = " + (length * width));
	}
}
