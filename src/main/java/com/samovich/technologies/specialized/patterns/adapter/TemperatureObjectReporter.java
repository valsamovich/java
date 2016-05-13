/**
 * @file TemperatureObjectReporter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 */

package com.samovich.specialized.patterns.adapter;

/*
 * TemperatureObjectReporter is an object adapter. It is similar in functionality
 * to TemperatureClassReporter, except that it utilizes composition for the
 * CelsiusReporter rather than inheritance.
 */
public class TemperatureObjectReporter implements TemperatureInfo {

    CelsiusReporter celsiusReporter;

    // Constructor
    public TemperatureObjectReporter() {
        celsiusReporter = new CelsiusReporter();
    }

    @Override
    public double getTemperatureInC() {
        return celsiusReporter.getTemperature();
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        celsiusReporter.setTemperature(temperatureInC);
    }

    @Override
    public double getTemperatureInF() {
        return cToF(celsiusReporter.getTemperature());
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        celsiusReporter.setTemperature(fToC(temperatureInF));
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 9 / 5) + 32);
    }

}
