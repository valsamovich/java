/**
 * @file StringHelper.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/27/2014
 */

package com.samovich.basics.exercises.exerciseE;

public class StringHelper {
    
    /**
     * Remove all characters 'A' in first 2 positions of the given string.
     * Example: "AACD" => "CD", "ABCD" => "BCD", "BBCA" => "BBCA"
     * @param str   Given String value
     * @return      Return String value
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
