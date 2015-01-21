package com.samovich.basics.concepts.objects.box;

public class TestEmployee {

	public static void main(String[] args) {
		
		/*Employee alex, linda, john;
		
		alex = new Employee();
		linda = new Employee();
		john = new Employee();*/
		
		//Object : Copy / Instance of the class
		
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 20000;
		alex.calculateTotalPay();
		
		linda.salary = 100500;
		linda.bonus = 20200;
		linda.calculateTotalPay();
		
		john.salary = 60050;
		john.bonus = 14000.56;
		john.calculateTotalPay();

	}

}
