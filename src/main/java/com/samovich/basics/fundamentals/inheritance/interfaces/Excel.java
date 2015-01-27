package com.samovich.basics.fundamentals.inheritance.interfaces;

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
