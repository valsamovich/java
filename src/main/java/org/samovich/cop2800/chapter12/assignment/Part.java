package org.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 * Updated: Valery Samovich on 7/10/2016
 */
public abstract class Part    // <--------------------- Made this class abstract
{
    private int partID;
    private String partDescription;
    private double partSellPrice;
    public static final String DEFAULT_PART_DESCRIPTION = "no part description";

    public Part(int id) throws InvalidProductionArgumentException {
        this(id, DEFAULT_PART_DESCRIPTION, 0);
    }

    public Part(int id, String desc, double price) throws InvalidProductionArgumentException {
        setPartID(id);
        setPartDescription(desc);
        setPartSellPrice(price);
    }

    public abstract double getProductCost();   // <--------------------- New abstract method added

    public int getPartID() {
        return partID;
    }

    public void setPartID(int newPartID) throws InvalidProductionArgumentException {
        if (newPartID >= 0)
            partID = newPartID;
        else
            throw new InvalidProductionArgumentException("The part ID was invalid");
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String newPartDescription) throws NullPointerException {
        if (newPartDescription.isEmpty())
            throw new NullPointerException("The part description was invalid");
        else
            partDescription = newPartDescription;

    }

    public double getPartSellPrice() {
        return partSellPrice;
    }

    public void setPartSellPrice(double newPartSellPrice) throws InvalidProductionArgumentException {
        if (newPartSellPrice >= 0)
            partSellPrice = newPartSellPrice;
        else
            throw new InvalidProductionArgumentException("The part sell price was invalid");
    }

    public String toString() {
        return "\tPart ID: " + this.getPartID() + "\n" +
                "\tDescription: " + this.getPartDescription() + "\n" +
                "\tSell Price: " + this.getPartSellPrice();
    }
}

