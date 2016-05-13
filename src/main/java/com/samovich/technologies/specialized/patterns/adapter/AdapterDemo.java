/**
 * @file AdapterDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/02/19
 *
 * In software engineering, the adapter pattern is a software design pattern
 * that allows the interface of an existing class to be used from another
 * interface. It is often used to make existing classes work with others without
 * modifying their source code.
 */

package com.samovich.specialized.patterns.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        // class adapter
        System.out.println("class adapter test");
        TemperatureInfo tempInfo = new TemperatureClassReporter();
        testTempInfo(tempInfo);

        // object adapter
        System.out.println("\nobject adapter test");
        tempInfo = new TemperatureObjectReporter();
        testTempInfo(tempInfo);

    }

    public static void testTempInfo(TemperatureInfo tempInfo) {
        tempInfo.setTemperatureInC(0);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());

        tempInfo.setTemperatureInF(85);
        System.out.println("temp in C:" + tempInfo.getTemperatureInC());
        System.out.println("temp in F:" + tempInfo.getTemperatureInF());
    }

}
