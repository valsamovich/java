package com.valerysamovich.java.basics.exercises.company;

import java.util.ArrayList;
import java.util.List;

public class Department {

	private String deptName;
	private double budget;

	// declares an array of integers: int[] anArray = new int[5];
	// private Employee[] emps = new Employee[5];
	private ArrayList<Employee> emps = new ArrayList<Employee>();
	
	private int counter = 0;

	// constructor
	public Department(String deptName) {
		this.deptName = deptName;
		this.budget = 50000;
	}

	public void addEmployee(Employee obj) {
		emps.add(obj);
		counter++;

		if (obj.getGrade() >= 5) {
			this.budget += 150000;
		} else {
			this.budget += 100000;
		}
	}

	public void describe() {
		String temp = "Dept Name: " + this.deptName 
				+ "\nBudget: " + this.budget + "\nEmployee: ";
		for (Employee x : emps) {
			// if (x != null) {
				temp += x.toString() + " ";
			// }
		}
		System.out.println(temp);
	}
}
