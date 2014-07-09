package com.valerysamovich.patric.day4.errorhandling;

public class ExampleException {

	public static void main(String[] args) {
		
		int d[] = new int[3];
		
		int a = 10;
		int b = 0;
		int c = 0;
		
		try{
			// d[4] = 10; run time exception
			d[1] = 10;
			c = a/b;
		}catch(Exception e){
			System.out.println("Exception occured " + e);
			e.printStackTrace();
		}finally{
			System.out.println("Will always run");
		}
		System.out.println("c = " + c); // compile time exception
	}

}
