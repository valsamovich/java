package com.samovich.java.basics.oldpath.exercises.company;

public class TestCompany {
	
	public static void main(String[] args) {
			
				
				Employee alex = new Employee("Alex Rod", 6);
				Employee linda = new Employee("Linda Berry", 7);
				Employee john = new Employee("John Doe", 3);
				
				Employee sara = new Employee("Sara Time", 7);
				Employee james = new Employee("James Doe", 4);
				
				Department sales = new Department("Sales");
				Department it = new Department("IT");
				
				// addEmployee associated the obj for sales department
				sales.addEmployee(alex);
				sales.addEmployee(linda);
				sales.addEmployee(john);
				
				// addEmployee associated the obj for it department
				it.addEmployee(sara);
				it.addEmployee(james);
				
				sales.describe();
				System.out.println(" ");
				it.describe();
	}

}
