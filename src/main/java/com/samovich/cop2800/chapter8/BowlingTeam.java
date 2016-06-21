package com.samovich.cop2800.chapter8;

/**
 * Filename BowlingTeam.java
 * Created by Valery Samovich
 * Written on 6/21/16
 */
public class BowlingTeam {
    // declare fields
    private String teamName;
    private String[] members = new String[4];

    /**
     * Set(mutator) method for teamName.
     * @param team
     */
    public void setTeamName(String team) {
        this.teamName = team;
    }

    /**
     * Get(accessor) method for team name.
     * @return
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Set(mutator) method for members.
     * @param number
     * @param name
     */
    public void setMembers(int number, String name) {
        members[number] = name;
    }

    /**
     * Get(accessor) method for members.
     * @param number
     * @return
     */
    public String getMember(int number) {
        return members[number];
    }
}