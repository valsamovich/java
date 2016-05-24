package com.samovich.cop2800.chapter4;

/**
 * Filename CreatePolicies.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class CreatePolicies {

    public static void main(String[] args) {

        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456,4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastle");
        // CarInsurancePolicy2 fourth = new CarInsurancePolicy2();

        first.display();
        second.display();
        third.display();
    }
}
