/**
 * @file MyPartValues.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/14
 */


package com.samovich.java.basics.concepts.objects.exercises;

public class MyPartValues {

    public static void main(String[] args) {

        IdentifyMyParts a = new IdentifyMyParts();
        IdentifyMyParts b = new IdentifyMyParts();

        a.y = 5;
        b.y = 6;
        a.x = 1;
        b.x = 2;

        System.out.println("a.y = " + a.y);
        System.out.println("b.y = " + b.y);
        System.out.println("a.x = " + a.x);
        System.out.println("b.x = " + b.x);
        System.out.println("IdentifyMyParts.x = " + IdentifyMyParts.x);

    }

}
