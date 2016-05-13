/**
 * @file TemperatureClassReporter.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 */

package com.samovich.specialized.patterns.adapter;

/*
 * Example of the class adapter. If a temperature is in Celcius,
 * TemperatureClassReporter utilizes the temperatureInC value from
 * CelciusReporter. Fahrenheit requests are internally handled in Celcius.
 */
public class TemperatureClassReporter extends CelsiusReporter implements TemperatureInfo {


    @Override
    public double getTemperatureInF() {
        return cToF(temperatureInC);
    }

    @Override
    public void setTemperatureInF(double temperatureInF) {
        this.temperatureInC = fToC(temperatureInF);
    }

    @Override
    public double getTemperatureInC() {
        return temperatureInC;
    }

    @Override
    public void setTemperatureInC(double temperatureInC) {
        this.temperatureInC = temperatureInC;
    }

    private double fToC(double f) {
        return ((f - 32) * 5 / 9);
    }

    private double cToF(double c) {
        return ((c * 5 / 9) + 32);
    }

}
