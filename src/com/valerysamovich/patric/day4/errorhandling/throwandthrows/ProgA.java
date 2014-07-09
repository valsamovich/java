package com.valerysamovich.patric.day4.errorhandling.throwandthrows;

public class ProgA {
	
public int divideNums(int a, int b) throws Exception{
		
		int c = 0;
		
		try{
			c = a/b;
		}catch(Exception e){
			System.out.println("ProgA exeption");
			throw new Exception("Please check yuor numbers");
		}
		return c;
	}
}
