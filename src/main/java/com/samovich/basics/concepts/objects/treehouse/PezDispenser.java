/**
 * @file FileName.java
 * @author samov004
 * @version 1.0.0
 * @date 9/9/15
 */

package com.samovich.basics.concepts.objects.treehouse;

public class PezDispenser {

    public static final int MAX_PEZ = 12;
    private String characterName;
    private int pezCount;

    // Constructor
    public PezDispenser(String characterName){
        this.characterName = characterName;
        this.pezCount = 0;
    }

    public boolean despense() {
        boolean wasDispensed = false;
        if (!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public boolean isEmpty() {
       return pezCount == 0;
    }

    // Getter
    public String getCharacterName() {
        return characterName;
    }

    public void load(){
        this.pezCount = MAX_PEZ;
    }
}
