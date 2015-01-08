package com.samovich.java.basics.concepts.overloading;

public class Box {
	
	// polymorphism
	// overloading: when methods of the same name are 
	//				differentiated by their passing arguments
	void calculateArea(int length){
		System.out.println("Double area = " + (length * length));
	}
	
	void calculateArea(double length){
		System.out.println("Double area = " + (length * length));
	}
	
	void calculateArea(int length, int width){
		System.out.println("Double area = " + (length * width));
	}
}
