package com.samovich.java.basics.concepts.inheritance.interfaces;

public class TestOffice {

	public static void main(String[] args) {
		
		Office obj = new Word();
		obj.open();
		obj.save();
		
		obj = new Excel();
		obj.open();
		obj.save();
		
		
	}

}
