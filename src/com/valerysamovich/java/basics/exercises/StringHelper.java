package com.valerysamovich.java.basics.exercises;

public class StringHelper {
    
    /**
     * Remove all characters 'A' in first 2 positions of the given string.
     * @param str
     * @return
     */
    public String truncateAInFirstTwoPositions(String str) {
        
        // If string equal 0
        if (str.length() == 0) {
            return str;
        }
        
        // If string more then 2 char
        if (str.length() < 2) {
            return str.replace("A", "");
        }
        
        String first2Char = str.substring(0, 2);
        String afterFirst2Char = str.substring(2);
        
        // Return the result
        return first2Char.replaceAll("A", "") + afterFirst2Char;
    }
}
