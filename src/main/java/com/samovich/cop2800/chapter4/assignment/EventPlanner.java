package com.samovich.cop2800.chapter4.assignment;

/**
 * Filename EventPlanner.java
 * Created by Valery Samovich
 * Written on 5/28/2016
 */
public class EventPlanner {

    public static void main(String[] args) {

        Event event1 = new Event();

        System.out.println("********************************");
        System.out.println("\t\tEvent ID: " + event1.getEventID());
        System.out.println("\t\tEvent ID: " + event1.getNumberOfGuest());
        System.out.println("\t\tEvent ID: " + event1.getEventDate());
        // System.out.println("\t\tEvent ID: " + event1.getPrice());
        System.out.println("********************************");
    }
}
