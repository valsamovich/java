/**
 * 
 */
package com.samovich.java.basics.oldpath.varargs;

public class ExampleVarArgs {
	
	// variable arguments
	public static void addNumbers(int ... a){
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		System.out.println("sum = " + sum);
	}
	
	public static void main(String[] args) {
		/*ExampleVarArgs obj = new ExampleVarArgs();
		obj.addNumbers(3, 4, 5);*/
		
		ExampleVarArgs.addNumbers(3, 4, 5, 78, 92, 34);
	}
}
