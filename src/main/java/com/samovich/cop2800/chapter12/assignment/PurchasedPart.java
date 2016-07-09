package com.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 */
public class PurchasedPart extends Part
{
	private double purchasePrice; //what does this part cost to buy?
	private String vendor;  //who do we buy this part from?
	private double handlingCost; //shipping and handling costs when we buy it
	public static final String DEFAULT_VENDOR_NAME = "no vendor name";
	
	public PurchasedPart()    // <--------------------- New constructor added
	{
		this(0);
	}
	public PurchasedPart(int id)
	{
		this(id, 0, 0, DEFAULT_VENDOR_NAME);
	}
	public PurchasedPart(int id, double hCost, double purPrice, String vend)
	{
		this(id, //id for Part object
			Part.DEFAULT_PART_DESCRIPTION, //desc for Part object
			0,  //sell price for Part object
			purPrice, // purchase price for PurchasedPart object
			vend,  // vendor for PurchasedPart object
			hCost); // handling cost for PurchasedPart object
	}
	public PurchasedPart(int id, String desc, double sellPrice,
			double purPrice, String vend, double hCost)
	{
		super(id, desc, sellPrice);  // call ctor for superclass (Part)
		this.setPurchasePrice(purPrice);
		this.setVendor(vend);
		this.setHandlingCost(hCost);
	}
	public double getProductCost ()    // <--------------------- New method added
	{
		return purchasePrice + handlingCost;
	}
	public double getPurchasePrice() {
		return purchasePrice;
	}
	public void setPurchasePrice(double newPurchasePrice) {
		purchasePrice = newPurchasePrice;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String newVendor) {
		vendor = newVendor;
	}
	public double getHandlingCost() {
		return handlingCost;
	}
	public void setHandlingCost(double newHandlingCost) {
		handlingCost = newHandlingCost;
	}
	public String toString()
	{
		return super.toString() + "\n" +
				"\tPurchase Price: " + this.getPurchasePrice() + "\n" +
				"\tVendor: " + this.getVendor() + "\n" +
				"\tHandling Cost: " + this.getHandlingCost();				
	}
}

