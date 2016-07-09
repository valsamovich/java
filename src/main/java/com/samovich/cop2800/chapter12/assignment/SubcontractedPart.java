package com.samovich.cop2800.chapter12.assignment;

/**
 * Filename ManufacturedPart.java
 * Created on 3/2014 by R Grant
 * Updated on 6/25/2016 by Valery Samovich
 */
public class SubcontractedPart extends ManufacturedPart {
    // declare fields
    private String processDescription; // description of what is done to this part
    private double subcontractCost; // cost for outside company to do this process
    public static final String DEFAULT_PROCESS_DESCRIPTION = "no process description";

    /**
     * Public constructor.
     */
    public SubcontractedPart(){
        super(0);
    }

    /**
     * Public constructor. Create minimal object.
     * @param id
     */
    public SubcontractedPart(int id) {
        this(id, DEFAULT_PROCESS_DESCRIPTION, 0);
    }

    /**
     * Public constructor.
     * @param id
     * @param processDesc
     * @param sCost
     */
    public SubcontractedPart(int id, String processDesc, double sCost) {
        super (id, 0, 0);  //call ManufacturedPart ctor
        this.setProcessDescription(processDesc);
        this.setSubcontractCost(sCost);
    }

    /**
     * Public constructor.
     * @param id for Part object
     * @param partDesc for Part object
     * @param sellPrice for Part object
     * @param lCost for ManufacturedCost object
     * @param mCost for ManufacturedCost object
     * @param processDesc for SubcontractedPArt object
     * @param sCost for SubcontractedPArt object
     */
    public SubcontractedPart(int id, String partDesc, double sellPrice, double lCost,
                             double mCost, String processDesc, double sCost) {
        super(id,           // for Part
                partDesc,   //
                sellPrice,  // part price
                lCost,      // description for part
                mCost);     // selling price of part
        this.setProcessDescription(processDesc);
        this.setSubcontractCost(sCost);
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public String getProcessDescription() {
        return processDescription;
    }

    /**
     * Setter(mutator) method.
     * @param newProcessDescription
     */
    public void setProcessDescription(String newProcessDescription) {
        if (newProcessDescription != null)
            processDescription = newProcessDescription;
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getSubcontractCost() {
        return subcontractCost;
    }

    /**
     * Setter(mutator) method.
     * @param newSubcontractCost
     */
    public void setSubcontractCost(double newSubcontractCost) {
        if (newSubcontractCost >= 0)
            subcontractCost = newSubcontractCost;
    }

    /**
     * Convert object information to string.
     * @return
     */
    public String toString() {
        return super.toString() + "\n" +
                "\tProcess Description: " + this.getProcessDescription()  + "\n" +
                "\tSubcontract Cost: " + this.getSubcontractCost();
    }

    /**
     * Getter(accessor) method.
     * @return
     */
    public double getProductCost() {
        double mpProductCost;
        mpProductCost = super.getProductCost();
        return mpProductCost + subcontractCost;
    }
}
