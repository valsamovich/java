/**
 * @file Student.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package com.samovich.java.basics.concepts.classes.staticex.student;

public class Student {

    public static void main(String[] args) {

        Student8 s1 = new Student8(111, "Karan");
        Student8 s2 = new Student8(222, "Aryan");

        s1.display();
        s2.display();
    }

}
