package com.valerysamovich.java.patric.day2.oop.overloading;

public class TestBox {

	public static void main(String[] args) {
		
		Box obj = new Box();
		obj.calculateArea(4);
		obj.calculateArea(3.7);
		obj.calculateArea(2, 4);

	}

}
