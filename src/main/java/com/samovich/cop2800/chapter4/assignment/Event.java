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
    private int numberOfGuests;             // number of guest
    private double price;                   // price
    private String eventDate;               // in gregorian format
    private final int PRICE_PER_GUEST = 35; // price per guest

    // create a GregorianCalendar object using default constructor
    GregorianCalendar now = new GregorianCalendar();

    /**
     * set(mutator) method for eventID.
     * @param eventID
     */
    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    /**
     * set(mutator) method for numberOfGuests.
     * @param numberOfGuests
     */
    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    /**
     * set(mutator) method for eventDate.
     * @param eventDate
     */
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * get(accessor) method for eventID.
     * @return
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * get(accessor) method for numberOfGusts.
     * @return
     */
    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    /**
     * get(accessor) method for ventDate.
     * @return
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * get(accessor) method for price.
     * @return
     */
    public int getPrice(int price) {
        return price;
    }

    /**
     * Default constructor.
     */
    public Event() {
        eventID = "not assigned";
        eventDate = (now.get(GregorianCalendar.MONTH) + 1) + "-" +
                now.get(GregorianCalendar.DAY_OF_MONTH) + "-" +
                now.get(GregorianCalendar.YEAR);
        numberOfGuests = 0;
    }

    /**
     * Overloaded constructor.
     * @param eventID
     * @param numberOfGuests
     * @param eventDate
     */
    public Event(String eventID, int numberOfGuests, String eventDate) {
        this.eventID = eventID;
        this.numberOfGuests = numberOfGuests;
        this.eventDate = eventDate;
    }

    /**
     * Overloaded constructor.
     * @param eventID
     * @param numberOfGuests
     */
    public Event(String eventID, int numberOfGuests) {
        this.eventID = eventID;
        this.numberOfGuests = numberOfGuests;
    }

    /**
     * Calculate price based on number of guest.
     * @return
     */
    public double calculatePrice() {
        return PRICE_PER_GUEST * numberOfGuests;
    }
}
