/**
 * @file Student8.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/05
 */

package com.samovich.basics.fundamentals.classes.staticex.student;

public class Student8 {

    int rollno;
    String name;
    static String college= "ITS";

    Student8(int r, String n) {
        this.rollno = r;
        this.name = n;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
