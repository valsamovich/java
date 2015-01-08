package com.samovich.java.basics.concepts.encapsulation.example1;

public class Employee {

	// Encapsulation: data & methods that act on the data.
	
	private double salary; //class data
	private double bonus;
	
	public void setSalary(double salary){
		if(salary >= 40000 && salary <= 200000){
			this.salary = salary;
		}else{
			this.salary = 0;
			System.out.println("Please check salary!");
		}
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void setBonus(double bonus){
		if(bonus >= 10000 && bonus <= 40000){
			this.bonus = bonus;
		}else{
			this.bonus = 0;
			System.out.println("Please check bonus!");
		}
	}
	
	public double getBonus(){
		return bonus;
	}
	
	public void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println(totalPay);
	}

}
