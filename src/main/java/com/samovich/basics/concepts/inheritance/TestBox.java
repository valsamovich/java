package com.samovich.basics.concepts.inheritance;

public class TestBox {

	public static void main(String[] args) {

		Box fedEx = new Box();
		fedEx.calculateArea(3, 4);
		
		NewBox ups = new NewBox();
		ups.calculateArea(4, 7);
		ups.colculateVolume(3, 4, 5);
	}

}
