package org.samovich.cop2800.chapter3;

/**
 * Filename SpaService.java
 * Created by Valery Samovich
 * Written on 5/23/2016
 */
public class SpaService {

    // fields declarations
    private String serviceDescription;
    private double price;

    public SpaService(){
        serviceDescription = "default";
        price = 0;
    }
    // set field  values
    public void setServiceDescription(String serviceDesc){
        serviceDescription = serviceDesc;
    }

    public void setPrice(double prc){
        price = prc;
    }

    // get field values
    public String getServiceDescription(){
        return serviceDescription;
    }

    public double getPrice(){
        return price;
    }

}
