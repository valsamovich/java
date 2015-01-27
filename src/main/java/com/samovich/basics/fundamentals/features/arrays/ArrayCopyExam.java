package com.samovich.basics.fundamentals.features.arrays;

public class ArrayCopyExam {

	public static void main(String[] args) {
		
		char[] charArray = {'e','s','p','r','e','s','s','o','8','9','0'};
		System.arraycopy(charArray, 2, charArray, 6, 5);
		System.out.println(charArray[8]);
	}

}
