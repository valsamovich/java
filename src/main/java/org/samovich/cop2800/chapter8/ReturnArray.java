package org.samovich.cop2800.chapter8;

/**
 * Filename ReturnArray.java
 * Created by Valery Samovich
 * Written on 6/21/2016
 */
public class ReturnArray {

    /**
     * main method
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Returned array: ");
        // loop over returned array
        for (int i = 0; i < ReturnArray.getArray().length; i++)
            System.out.print(ReturnArray.getArray()[i] + " ");
    }

    /**
     * Retunr the array
     * @return
     */
    private static int[] getArray() {
        int[] scores = {90, 80, 70, 60};
        return scores;
    }
}
