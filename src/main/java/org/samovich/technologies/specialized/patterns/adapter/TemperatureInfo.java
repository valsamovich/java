/**
 * @file TemperatureInfo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 */

package org.samovich.technologies.specialized.patterns.adapter;

/*
 * Target Interface that will be implemented by our adapter. It defines actions
 * our adapter will perform.
 */
public interface TemperatureInfo {

    public double getTemperatureInF();
    public void setTemperatureInF(double temperatureInF);
    public double getTemperatureInC();
    public void setTemperatureInC(double temperatureInC);

}
