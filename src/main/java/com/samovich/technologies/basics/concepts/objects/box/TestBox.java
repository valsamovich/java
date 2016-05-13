package com.samovich.basics.concepts.objects.box;

public class TestBox {

	public static void main(String[] args) {
		
		Box ups = new Box();
		Box fedEx = new Box();
		
		ups.length = 5;
		ups.width = 10;
		int area1 = ups.calculateArea(4, 3);
		
		fedEx.length = 6;
		fedEx.width = 7;
		int area2 = fedEx.calculateArea(2, 5);
		
		System.out.println("Total od ups and fedEx = " + (area1 + area2));

	}

}
