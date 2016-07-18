package com.samovich.cop2800.chapter13.serialization;

import java.io.*;
 public abstract class Employee implements Serializable{
	private String name;   	// employee name
	private long SSN; 		// employee id number
	public Employee(){
		name = "unassigned";
		SSN = 0;
	}			
	public Employee(String nme, long socSecNum){
		setName(nme);
		setSSN(socSecNum);
	}
	public void setName (String newName){
		if (! (newName.equals(null)))
			name = newName;
	}
	public void setSSN (long newSSN){
		if (newSSN > 0)
			SSN = newSSN; 
	}
	public String getName(){
		return name;
	}
	public long getSSN(){
		return SSN;
	}
	public String toString(){
		return "\nName: " + name + " SSN: " + SSN;
	}
	public abstract double calcPay();
}