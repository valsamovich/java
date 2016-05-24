package com.samovich.cop2800.chapter4;

/**
 * Filename CreatePolicies.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class CreatePolicies {

    public static void main(String[] args) {

        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456,4);
        CarInsurancePolicy third = new CarInsurancePolicy (789, 12, "Newcastle");

        first.display();
        second.display();
        third.display();
    }
}
