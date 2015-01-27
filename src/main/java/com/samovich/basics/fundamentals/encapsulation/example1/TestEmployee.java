package com.samovich.basics.fundamentals.encapsulation.example1;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee alex = new Employee();
		
		alex.setSalary(100000);
		alex.setBonus(20000);
		alex.calculateTotalPay();
		
		System.out.println("Alex salary is: " + alex.getSalary());
		System.out.println("Alex bonus is: " + alex.getBonus());
		
	}

}
