package com.samovich.basics.exercises.exerciseA;

public class ExerciseA {

	public static void main(String[] args) {
		
		double salary = 78678.65;
		double tax = 0.0;
		
		if(salary <= 15000){
			tax = salary * .10;
		}else if(salary <= 40000){
			tax = salary * .20;
		}else{
			tax = salary * .30;
		}
		
		System.out.println("Tax " + tax);
	}

}
