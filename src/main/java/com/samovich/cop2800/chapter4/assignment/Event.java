package com.samovich.cop2800.chapter4.assignment;

import java.util.GregorianCalendar;

/**
 * Filename Event.java
 * Created by Valery Samovich
 * Written on 5/28/2016
 */
public class Event {

    // declare variables
    private String eventID;                 // event id
    private int numberOfGuest;              // number of guest
    private double price;                   // price
    private String eventDate;               // in gregorian format
    private final int PRICE_PER_GUEST = 35; // price per guest

    // get methods, header documentation omitted to save space
    public String getEventID() {return eventID;}
    public int getNumberOfGuest() {return numberOfGuest;}
    public String getEventDate() {return eventDate;}
    public int getPrice(int price){return  price;}

    // set methods, header documentation omitted to save space
    public void setEventID(String eventID) {this.eventID = eventID;}
    public void setNumberOfGuest(int numberOfGuest) {this.numberOfGuest = numberOfGuest;}
    public void setEventDate(String eventDate) {this.eventDate = eventDate;}

    // calculate the price
    public double calculatePrice(){
        return price = PRICE_PER_GUEST * numberOfGuest;
    }

    // default contractor
    public Event(){
        eventID = "not assigned";
        eventDate = "2016-05-28"; //TODO: implement Gregorian current date
        numberOfGuest = 0;
    }

    // overloaded constructor with 3 arguments
    public Event(String eventID, int numberOfGuest, String eventDate){
        this.eventID = eventID;
        this.numberOfGuest = numberOfGuest;
        this.eventDate = eventDate;
    }

    // overloaded constructor with 2 arguments
    public Event(String eventID, int numberOfGuest){
        this.eventID = eventID;
        this.numberOfGuest = numberOfGuest;
    }
}
