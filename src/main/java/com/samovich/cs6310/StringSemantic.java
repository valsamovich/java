package com.samovich.cs6310;

/**
 * Filename StringSemantic
 * Created by Valery Samovich
 * Written on 1/15/17
 */
public class StringSemantic {

    public static void main(String[] args) {

        // variables
        String s = "foo";
        System.out.println(s);
        System.out.println("");

        System.out.println("1st example:");
        // 1st example
        if (s.equals("foo")){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }
        System.out.println("");

        System.out.println("2nd example:");
        // 2nd example
        if ("foo".equals(s)){
            System.out.println("equals");
        } else {
            System.out.println("not equals");
        }

    }
}
