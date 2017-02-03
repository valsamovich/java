package org.samovich.cop2800.chapter11;

/**
 * Filename Vehicle.java
 * Created by Valery Samovich
 * Written on 7/2/2016
 */
public abstract class Vehicle {
    // declare fields
    private String powerSource;
    private int wheels;
    protected int price;

    /**
     * Public constructor.
     * @param powerSource
     * @param wheels
     */
    public Vehicle (String powerSource, int wheels) {
        setPowerSource(powerSource);
        setWheels(wheels);
        setPrice();
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public String getPowerSource () {
        return powerSource;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public int getWheels () {
        return wheels;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public int getPrice () {
        return price;
    }

    /**
     * Setter(mutator) method.
     * @param source
     */
    public void setPowerSource (String source) {
        powerSource = source;
    }

    /**
     * Setter(mutator) method.
     * @param wls
     */
    public void setWheels(int wls) {
        wheels = wls;
    }

    /**
     * Setter(mutator) method.
     */
    public abstract void setPrice ();
}
