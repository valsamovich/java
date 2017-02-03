package org.samovich.technologies.basics.concepts.inheritance.abstractex;

public abstract class Container {
	
	// Abstract class: Class which has empty methods and fully defined methods
	public void calculateVolume(int length, int height){
		double volume = calculateAreaOfBase(length) * height;
		System.out.println("Volume = " + volume);
	}
	
	public abstract double calculateAreaOfBase(int length);

}
