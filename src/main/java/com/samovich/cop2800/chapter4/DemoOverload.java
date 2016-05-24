package com.samovich.cop2800.chapter4;

/**
 * Filename DemoOverload.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class DemoOverload {

    public static void main(String[] args) {

        int month = 5, day = 24, year = 2016;
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int mm){
        System.out.println("Event date " + mm + "/24/2016");
    }

    public static void displayDate(int mm, int dd){
        System.out.println("Event date " + mm + "/" + dd + "/2016");
    }

    public static void displayDate(int mm, int dd, int yy){
        System.out.println("Event date " + mm + "/" +  dd +"/" + yy);
    }

}
