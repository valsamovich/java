package com.valerysamovich.java.patric.day3.interfaceex;

public class Excel implements Office{
	
	public void New(){
		System.out.println("Excel New .xls");
	}
	
	public void open(){
		System.out.println("Excel Open .xls");
	}
	
	public void save(){
		System.out.println("Excel Save .xls");
	}
}
