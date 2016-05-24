package com.samovich.cop2800.chapter4;

/**
 * Filename CarInsurancePolicy2.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class CarInsurancePolicy2 {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // constructor with three data fields
    public CarInsurancePolicy2(int num, int payments, String city){
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    // constructor with preassigned value
    public CarInsurancePolicy2(int num, int payments){
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }

    // constructor with only policy number requirements
    public CarInsurancePolicy2(int num){
        this(num, 2, "Mayfield");
    }

    public void display(){
        System.out.println("Policy #" + policyNumber + ". " + numPayments +
                " payments annually. Driver resides in " + residentCity + ".");
    }
}
