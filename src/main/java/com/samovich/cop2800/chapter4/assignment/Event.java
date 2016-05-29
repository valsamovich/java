package com.samovich.cop2800.chapter4.assignment;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Filename Event.java
 * Created by Valery Samovich
 * Written on 5/28/2016
 */
public class Event {

    // declare variables
    private String eventID;                 // event id
    private int numberOfGuests;             // number of guest
    private double price;                   // price
    private String eventDate;               // in gregorian format
    private final int PRICE_PER_GUEST = 35; // price per guest

    // create a GregorianCalendar object using default constructor
    GregorianCalendar now = new GregorianCalendar();

    // set methods, header documentation omitted to save space
    public void setEventID(String eventID) {this.eventID = eventID;}
    public void setNumberOfGuests(int numberOfGuests) {this.numberOfGuests = numberOfGuests;}
    public void setEventDate(String eventDate) {this.eventDate = eventDate;}

    // get methods, header documentation omitted to save space
    public String getEventID() {return eventID;}
    public int getNumberOfGuests() {return numberOfGuests;}
    public String getEventDate() {return eventDate;}
    public int getPrice(int price){return  price;}

    // default contractor
    public Event(){
        eventID = "not assigned";
        eventDate = "1-11-2014";
        numberOfGuests = 0;
    }

    // overloaded constructor with 3 arguments
    public Event(String eventID, int numberOfGuests, String eventDate){
        this.eventID = eventID;
        this.numberOfGuests = numberOfGuests;
        this.eventDate = eventDate;
    }

    // overloaded constructor with 2 arguments
    public Event(String eventID, int numberOfGuests){
        this.eventID = eventID;
        this.numberOfGuests = numberOfGuests;
    }

    // calculate the price
    public double calculatePrice(){
        return PRICE_PER_GUEST * numberOfGuests;
    }
}
