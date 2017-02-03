package org.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 * Updated: Valery Samovich on 7/10/2016
 */
public class PurchasedPart extends Part {
    private double purchasePrice; //what does this part cost to buy?
    private String vendor;  //who do we buy this part from?
    private double handlingCost; //shipping and handling costs when we buy it
    public static final String DEFAULT_VENDOR_NAME = "no vendor name";

    public PurchasedPart() throws InvalidProductionArgumentException    // <--------------------- New constructor added
    {
        this(0);
    }

    public PurchasedPart(int id) throws InvalidProductionArgumentException {
        this(id, 0, 0, DEFAULT_VENDOR_NAME);
    }

    public PurchasedPart(int id, double hCost, double purPrice, String vend) throws InvalidProductionArgumentException {
        this(id, //id for Part object
                Part.DEFAULT_PART_DESCRIPTION, //desc for Part object
                0,  //sell price for Part object
                purPrice, // purchase price for PurchasedPart object
                vend,  // vendor for PurchasedPart object
                hCost); // handling cost for PurchasedPart object
    }

    public PurchasedPart(int id, String desc, double sellPrice,
                         double purPrice, String vend, double hCost) throws InvalidProductionArgumentException {
        super(id, desc, sellPrice);  // call ctor for superclass (Part)
        this.setPurchasePrice(purPrice);
        this.setVendor(vend);
        this.setHandlingCost(hCost);
    }

    public double getProductCost()    // <--------------------- New method added
    {
        return purchasePrice + handlingCost;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double newPurchasePrice) throws InvalidProductionArgumentException {
        if (newPurchasePrice >= 0)
            purchasePrice = newPurchasePrice;
        else
            throw new InvalidProductionArgumentException("The purchase price was invalid");
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String newVendor) throws NullPointerException {
        if (newVendor.isEmpty())
            throw new NullPointerException("The vendor description was invalid");
        else
            vendor = newVendor;
    }

    public double getHandlingCost() {
        return handlingCost;
    }

    public void setHandlingCost(double newHandlingCost) throws InvalidProductionArgumentException {
        if (newHandlingCost >= 0)
            handlingCost = newHandlingCost;
        else
            throw new InvalidProductionArgumentException("The handling cost was invalid");
    }

    public String toString() {
        return super.toString() + "\n" +
                "\tPurchase Price: " + this.getPurchasePrice() + "\n" +
                "\tVendor: " + this.getVendor() + "\n" +
                "\tHandling Cost: " + this.getHandlingCost();
    }
}

