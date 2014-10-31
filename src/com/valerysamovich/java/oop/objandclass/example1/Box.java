package com.valerysamovich.java.oop.objandclass.example1;

public class Box {
	
	int length; // class level data
	int width;
	
	
	int calculateArea(int length, int width){ // passing arguments
		int area = this.length * this.width;
		System.out.println("Area = " + area);
		return area;
	}
}
