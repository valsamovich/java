package com.valerysamovich.java.errorhandling.throwandthrows;

public class ProgB {

	public static void main(String[] args) {
		
		ProgA obj = new ProgA();
		
		try{
			System.out.println(obj.divideNums(10, 0));
		}catch(Exception e){
			System.out.println("ProgB = " + e.getMessage());
		}
	}
}
