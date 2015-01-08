package com.samovich.java.basics.concepts.features.statements;

public class Java7Looping {

	public static void main(String[] args) {

		int intArray[] = {1, 2, 3, 4, 5};
		int index = 0;
		do {
			while (index < 10) {
				System.out.println(index++ + " ");
			}
		} while (index < intArray.length);

	}

}
