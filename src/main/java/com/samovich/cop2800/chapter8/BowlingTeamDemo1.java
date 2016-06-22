package com.samovich.cop2800.chapter8;

import java.util.Scanner;

/**
 * Filename BowlingTeamDemo1.java
 * Created by Valery Samovich
 * Written on 6/21/16
 */
public class BowlingTeamDemo1 {
    public static void main(String[] args) {
        // declare files, objects
        String name;
        int x;
        final int NUM_TEAM_MEMBERS = 4;
        BowlingTeam bowlTeam = new BowlingTeam();
        Scanner input = new Scanner(System.in);

        // prompt the user and assign team name
        System.out.print("Enter team name >> ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);

        // loop over team numbers
        for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
            System.out.print("Enter team member's name >> ");
            name = input.nextLine();
            bowlTeam.setMembers(x, name);
        }

        // display the details of the team
        System.out.println("\nMembers of the team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBERS; x++) {
            System.out.print(bowlTeam.getMember(x) + " ");
        }
        System.out.println();

    }
}
