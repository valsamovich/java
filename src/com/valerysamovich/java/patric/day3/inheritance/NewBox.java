package com.valerysamovich.java.patric.day3.inheritance;

// Inheritance: when a class acquires the properties of another class
// Extended class, child class, sub class

// Overriding: when a method in the subclass has the same signature 
// as a method in the super class, then the subclass method takes precedence

public class NewBox extends Box {

	public void colculateVolume(int length, int width, int height) {
		System.out.println("Voleme = " + (length * width * height));
	}

}
