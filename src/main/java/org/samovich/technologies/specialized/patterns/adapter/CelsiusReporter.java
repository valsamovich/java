/**
 * @file CelsiusReporter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 */

package org.samovich.technologies.specialized.patterns.adapter;

/*
 * The adaptee class. It stores temperature value in Celsius.
 */
public class CelsiusReporter {

    double temperatureInC;

    // Constructor
    public CelsiusReporter() {}

    // Getter
    public double getTemperature() {
        return temperatureInC;
    }

    // Setter
    public void setTemperature(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

}
