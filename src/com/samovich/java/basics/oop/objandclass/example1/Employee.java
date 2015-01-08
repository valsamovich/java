package com.samovich.java.basics.oop.objandclass.example1;

public class Employee {
	
	// encapsulation: data & methods that act on the data
	double salary;
	double bonus;
	
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Totla pay " + totalPay);
	}
	
}
