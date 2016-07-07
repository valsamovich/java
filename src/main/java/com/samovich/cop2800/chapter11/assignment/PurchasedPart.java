package com.samovich.cop2800.chapter11.assignment;

/**
 * Filename ManufacturedPart.java
 * Created on 3/2014 by R Grant
 * Updated on 6/25/2016 by Valery Samovich
 */
public class PurchasedPart extends Part {
    // declare fields
    private double purchasePrice; // what does this part cost to buy?
    private String vendor;  // who do we buy this part from?
    private double handlingCost; // shipping and handling costs when we buy it
    public static final String DEFAULT_VENDOR_NAME = "no vendor name";

    /**
     * Public constructor.
     */
    public PurchasedPart() {
        super(0, DEFAULT_PART_DESCRIPTION, 0);
    }

    /**
     * Public constructor.
     * @param id
     */
    public PurchasedPart(int id) {
        this(id, 0, 0, DEFAULT_VENDOR_NAME);
    }

    /**
     * Public constructor.
     * @param id
     * @param hCost
     * @param purPrice
     * @param vend
     */
    public PurchasedPart(int id, double hCost, double purPrice, String vend) {
        this(id, // id for Part object
            Part.DEFAULT_PART_DESCRIPTION, // desc for Part object
            0,  // sell price for Part object
            purPrice, // purchase price for PurchasedPart object
            vend,  // vendor for PurchasedPart object
            hCost); // handling cost for PurchasedPart object
    }

    /**
     * Public constructor.
     * @param id
     * @param desc
     * @param sellPrice
     * @param purPrice
     * @param vend
     * @param hCost
     */
    public PurchasedPart(int id, String desc, double sellPrice,
            double purPrice, String vend, double hCost) {
        super(id, desc, sellPrice);  // call ctor for superclass (Part)
        this.setPurchasePrice(purPrice);
        this.setVendor(vend);
        this.setHandlingCost(hCost);
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * Setter(mutator) method.
     * @param newPurchasePrice
     */
    public void setPurchasePrice(double newPurchasePrice) {
        if (newPurchasePrice >= 0)
            purchasePrice = newPurchasePrice;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Setter(mutator) method.
     * @param newVendor
     */
    public void setVendor(String newVendor) {
        if (newVendor != null)
            vendor = newVendor;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getHandlingCost() {
        return handlingCost;
    }

    /**
     * Setter(mutator) method.
     * @param newHandlingCost
     */
    public void setHandlingCost(double newHandlingCost) {
        if (newHandlingCost >= 0)
            handlingCost = newHandlingCost;
    }

    /**
     * Convert object information to string.
     * @return
     */
    public String toString() {
        return super.toString() + "\n" +
                "\tPurchase Price: " + this.getPurchasePrice() + "\n" +
                "\tVendor: " + this.getVendor() + "\n" +
                "\tHandling Cost: " + this.getHandlingCost();
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getProductCost() {
        return purchasePrice + handlingCost;
    }
}
