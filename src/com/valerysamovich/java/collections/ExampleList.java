package com.valerysamovich.java.collections;

import java.util.ArrayList;
import java.util.List;

public class ExampleList{

	public static void main(String[] args) {
		
		String arr[] = new String[10];
		arr[0] = "zero";
		arr[9] = "nine";
		//arr[10] = "onemore";
		
		// non generic list, can add anything
		ArrayList list = new ArrayList();
		list.add("zero");
		list.add("one");
		list.add(2);
		list.add(true);
		
		for (Object temp : list) {
			System.out.println(temp);
		}
		
		
		System.out.println(" "); // space
		
		// generic list can only add specific
		List<String> gList = new ArrayList<String>();
		gList.add("zero");
		gList.add("one");
		gList.add("two");
		gList.add("three");
		gList.add("four");
		// gList.add(5); // cannot add a number
		
		gList.remove(2);
		gList.remove("Four");
		gList.add(0, "Start");
		
		for (String temp : gList) {
			System.out.println(temp);
		}
	}

}
