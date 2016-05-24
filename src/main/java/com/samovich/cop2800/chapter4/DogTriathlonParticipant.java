package com.samovich.cop2800.chapter4;

/**
 * Filename DogTriathlonParticipant.java
 * Created by Valery Samovich
 * Written on 5/24/16
 */
public class DogTriathlonParticipant {

    // variables
    private final int NUM_EVENTS;
    private static int totalCumulativeScore = 0;
    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    // constructor
    public DogTriathlonParticipant(String name,
                                   int numEvents,
                                   int score1,
                                   int score2,
                                   int score3){
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = score1;
        conformationScore = score2;
        agilityScore = score3;

        total = obedienceScore + conformationScore + agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

    public void display(){
        System.out.println(name + " participated in " + NUM_EVENTS +
                " events and has an avarage score of " + avg);
        System.out.println("   " + name + "has a total score of " + total +
                " bringing the total cumulative score to " + totalCumulativeScore);
    }

}
