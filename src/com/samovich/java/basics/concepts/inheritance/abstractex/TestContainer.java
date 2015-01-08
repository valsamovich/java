package com.samovich.java.basics.concepts.inheritance.abstractex;

public class TestContainer {

	public static void main(String[] args) {
		
		CircleContainer c1 = new CircleContainer();
		c1.calculateVolume(10, 5);
		
		Container s1 = new SquareContainer();
		s1.calculateVolume(10, 5);

	}

}
