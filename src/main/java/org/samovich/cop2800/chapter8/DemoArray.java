package org.samovich.cop2800.chapter8;

/**
 * Filename DemoArray.java
 * Created by Valery Samovich
 * Written on 6/21/16
 */
public class DemoArray {
    public static void main(String[] args) {
        // declaring array
        double[] salaries = new double[4];
        salaries[0] = 6.25;
        salaries[1] = 6.55;
        salaries[2] = 10.25;
        salaries[3] = 16.85;
        // loop over array
        System.out.println("Salaries one by one are:");
        for (int i = 0; i < salaries.length; i++) {
            System.out.println(salaries[i]);
        }

        // initializing array
        double[] prices = {5.35, 8.65, 11.15, 13.35};
        // loop over array
        System.out.println("Prices one by one are:");
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
