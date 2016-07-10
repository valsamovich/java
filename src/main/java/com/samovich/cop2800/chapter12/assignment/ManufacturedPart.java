package com.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */
public class ManufacturedPart extends Part {
    private double laborCost;
    private double materialCost;

    public ManufacturedPart()  // <--------------------- New constructor added
    {
        this(0, 0, 0);
    }

    public ManufacturedPart(int id) {
        this(id, 0, 0);
    }

    public ManufacturedPart(int id, double lCost, double mCost) {
        this(id, Part.DEFAULT_PART_DESCRIPTION, 0,
                lCost, mCost);
    }

    public ManufacturedPart(int id, String desc, double sellPrice,  //for PArt object
                            double lCost, double mCost)  //for this object
    {
        super(id, desc, sellPrice);
        this.setLaborCost(lCost);
        this.setMaterialCost(mCost);
    }

    public double getProductCost()   // <--------------------- New method added
    {
        return laborCost + materialCost;
    }

    public double getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(double laborCost) {
        this.laborCost = laborCost;
    }

    public double getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(double materialCost) {
        this.materialCost = materialCost;
    }

    public String toString() {
        return super.toString() + "\n" +
                "\tLabor Cost: " + this.getLaborCost() + "\n" +
                "\tMaterial Cost: " + this.getMaterialCost();
    }
}

