package com.samovich.cop2800.chapter4;

/**
 * Filename CarInsurancePolicy.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class CarInsurancePolicy {

    private int policyNumber;
    private int numPayments;
    private String residentCity;

    // constructor with three data fields
    public CarInsurancePolicy(int num, int payments, String city){
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }

    // constructor with preassigned value
    public CarInsurancePolicy(int num, int payments){
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }

    // constructor with only policy number requirements
    public CarInsurancePolicy(int num){
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }

    public void display(){
        System.out.println("Policy #" + policyNumber + ". " + numPayments +
                " payments annually. Driver resides in " + residentCity + ".");
    }
}
