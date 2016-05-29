package com.samovich.cop2800.chapter4;

public class EmployeeConstructor{
    private String name;		//employee name
    private long empID;			//unique employee id
    private long dateOfBirth;	//in Julian format
    private double hrsWorked;	// hours employee worked this period
    private double hrlyRate;	// pay rate per hour worked

    public EmployeeConstructor() {	//"default" constructor
        name = "not assigned";
        empID = 99999;
        hrsWorked = 40.0;
        hrlyRate = 10.0;
    }
            //overloaded constructor
    public EmployeeConstructor(String nme, long eID, long dob) {
        name = nme;
        empID = eID;
        hrsWorked = 40.0;
        hrlyRate = 10.0;
        dateOfBirth = dob;
    }
            //get methods, header documentation omitted to save space
    public String getName(){return name;}
    public long getEmpID() {return empID;}
    public long getDateOfBirth() {return dateOfBirth;}
    public double getHrs() {return hrsWorked;}
    public double getRate() {return hrlyRate;}
                //set methods, header documentation omitted to save space
    public void setName(String nme){name = nme;}
    public void setEmpID(long eID) {empID = eID;}
    public void setDateOfBirth(long dob) {dateOfBirth = dob;}
    public void setHrs (double hrs) {hrsWorked = hrs;}
    public void setRate (double rate) {hrlyRate = rate;}

    public double calcPay ()
    {
        return hrsWorked * hrlyRate;
    }

    public double calcPay (double rate)
    {
        setRate(rate);
        return hrsWorked * hrlyRate;
    }

    public double calcPay (double rate, double hrs)
    {
        setRate(rate);
        setHrs(hrs);
        return hrsWorked * hrlyRate;
    }
}

