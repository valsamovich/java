package com.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */
public abstract class Part    // <--------------------- Made this class abstract
{
	private int partID;
	private String partDescription;
	private double partSellPrice;
	public static final String DEFAULT_PART_DESCRIPTION = "no part description";
	
	public Part(int id)
	{
		this(id, DEFAULT_PART_DESCRIPTION, 0);
	}
	public Part (int id, String desc, double price)
	{
		setPartID(id);
		setPartDescription(desc);
		setPartSellPrice(price);
	}
	public abstract double getProductCost ();   // <--------------------- New abstract method added
	
	public int getPartID() {
		return partID;
	}
	public void setPartID(int newPartID) {
		if (newPartID >= 0 )
			partID = newPartID;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String newPartDescription) {
		if (newPartDescription != null)
			partDescription = newPartDescription;
	}
	public double getPartSellPrice() {
		return partSellPrice;
	}
	public void setPartSellPrice(double newPartSellPrice) {
		if (newPartSellPrice >= 0)
			partSellPrice = newPartSellPrice;
	}	
	public String toString()
	{
		return 	"\tPart ID: " + this.getPartID() + "\n" +
				"\tDescription: " +this.getPartDescription() + "\n" +
				"\tSell Price: " + this.getPartSellPrice();
	}
}

