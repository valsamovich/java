/**
 * @file LineBreakAfterX.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 * 
 * Prints an X values per line.
 */

package org.samovich.technologies.basics.concepts.features.statements.forex;

public class PrintXValuesPerLine {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num = 0; num < numbers.length; num++ ) {
            if((num%3) == 0){
                System.out.print("\n");
            }
            System.out.print(numbers[num]);
            
        }
        
    }
   
}
