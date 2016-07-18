package com.samovich.cop2800.chapter13.serialization;

import com.samovich.cop2800.chapter13.serialization.Employee;

import java.io.*;
import java.util.*;

public class HrlyEmployee extends Employee implements Serializable{
	public final static double DEFAULT_HRS_WORKED = 40;
	public final static double DEFAULT_HRLY_RATE = 10.5;
	public final static double OT_START_POINT = 40;
	public final static double OT_RATE = 1.5;

	private	double hours;   			// hours worked
	private double rate;				// pay rate per hour
	GregorianCalendar lastPayDate;
		
	public HrlyEmployee(){
		setHours(DEFAULT_HRS_WORKED);
		setRate(DEFAULT_HRLY_RATE);
		setLastPaydate(new GregorianCalendar());
	}

	public HrlyEmployee(double hrs, double rte, GregorianCalendar lpd){
		setHours(hrs);
		setRate(rte);
		setLastPaydate(lpd);
	}
	public HrlyEmployee(double hrs, double rte, GregorianCalendar lpd, String nme, long socSecNum){
		super(nme, socSecNum);
		setHours(hrs);
		setRate(rte);
		setLastPaydate(lpd);
	}
	public void setHours(double hrs){
		if (hrs > 0)
			hours = hrs;
	}
	public void setRate(double rte){
		if (rte > 0)
			rate = rte;
	}
	public void setLastPaydate(GregorianCalendar lpd){
		if (lpd.before(new GregorianCalendar()))
			lastPayDate = lpd;
	}
	public double getHours() {
		return hours;
	}
	public double getRate(){
		return rate;
	}
	public GregorianCalendar getLastPaydate( ){
		return lastPayDate;
	}
	public String toString(){
		return super.toString() + " Hours " + hours + " " + " Rate: " + rate;
	}
	public double calcPay() {
		if (hours > OT_START_POINT)
			return rate * DEFAULT_HRS_WORKED + (rate * OT_RATE * (hours - OT_START_POINT));
		else
			return rate * hours;
	}
}