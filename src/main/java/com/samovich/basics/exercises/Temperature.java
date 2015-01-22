/**
 * @file Temperature.java
 * @author Valery Samovich
 * @version 2
 * @date 2015/01/21
 */

package com.samovich.basics.exercises;

public class Temperature {

    public static void main(String[] args) {
        
        String[] nums = {"10", "20", "30", "40"};
        
        int total = 0;
        for(String temp : nums){
            total += Integer.parseInt(temp);
        }
        System.out.println("Total = " + total);
    }

}
