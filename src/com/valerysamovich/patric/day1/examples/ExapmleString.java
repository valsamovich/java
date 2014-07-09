package com.valerysamovich.patric.day1.examples;

public class ExapmleString {

	public static void main(String[] args) {
		
		//[0]J [1]a [2]m [3]e [4]s [5]_ [6]D [7]e [8]a [9]n
 		String x = "James Dean";
 		
 		// String methods
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 7));
		System.out.println(x.charAt(3));
		
		String age = "37";
		String salary = "78965.83";
		
		//Wrapper classes
		int a = Integer.parseInt(age) + 2;
		System.out.println(a);
		
		double s = Double.parseDouble(salary) * .15;
		System.out.println(s);

	}

}
