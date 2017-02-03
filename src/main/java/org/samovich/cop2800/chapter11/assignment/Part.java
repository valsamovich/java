package org.samovich.cop2800.chapter11.assignment;

/**
 * Filename ManufacturedPart.java
 * Created on 3/2014 by R Grant
 * Updated on 6/25/2016 by Valery Samovich
 */
public abstract class Part {
    // declare fields
    private int partID;
    private String partDescription;
    private double partSellPrice;
    public static final String DEFAULT_PART_DESCRIPTION = "no part description";

    /**
     * Public constructor.
     * @param id
     */
    public Part(int id) {
        this(id, DEFAULT_PART_DESCRIPTION, 0);
    }

    /**
     * Public constructor.
     * @param id
     * @param desc
     * @param price
     */
    public Part (int id, String desc, double price) {
        setPartID(id);
        setPartDescription(desc);
        setPartSellPrice(price);
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public int getPartID() {
        return partID;
    }

    /**
     * Setter(mutator) method.
     * @param newPartID
     */
    public void setPartID(int newPartID) {
        if (newPartID >= 0 )
            partID = newPartID;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public String getPartDescription() {
        return partDescription;
    }

    /**
     * Setter(mutator) method.
     * @param newPartDescription
     */
    public void setPartDescription(String newPartDescription) {
        if (newPartDescription != null)
            partDescription = newPartDescription;
    }

    /**
     * Getter(accessor) method.
     * @return partSellPrice
     */
    public double getPartSellPrice() {
        return partSellPrice;
    }

    /**
     * Setter(mutator) method.
     * @param newPartSellPrice
     */
    public void setPartSellPrice(double newPartSellPrice) {
        if (newPartSellPrice >= 0)
            partSellPrice = newPartSellPrice;
    }

    /**
     * Convert object information to string.
     * @return
     */
    public String toString() {
        return 	"\tPart ID: " + this.getPartID() + "\n" +
                "\tDescription: " +this.getPartDescription() + "\n" +
                "\tSell Price: " + this.getPartSellPrice();
    }

    /**
     * Abstract method.
     * @return
     */
    public abstract double getProductCost();
}
