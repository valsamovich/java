/**
 * @file CelsiusReporter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 */

package com.samovich.specialized.patterns.adapter;

public class CelsiusReporter {

    double temperatureInC;

    public CelsiusReporter() {}

    public double getTemperature() {
        return temperatureInC;
    }

    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

}
