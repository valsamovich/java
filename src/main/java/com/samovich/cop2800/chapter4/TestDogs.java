package com.samovich.cop2800.chapter4;

/**
 * Filename TestDogs.java
 * Created by Valery Samovich
 * Written on 5/25/16
 */
public class TestDogs {

    public static void main(String[] args) {

        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0);
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Rush", 3, 78, 72, 80);
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Ginger", 3, 90, 86, 72);

        dog1.display();
        dog2.display();
        dog3.display();

    }
}
