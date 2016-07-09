package com.samovich.cop2800.chapter12.assignment;

import java.io.Serializable;

/**
 * Filename InvalidProductionArgumentException.java
 * Created by Valery Samovich
 * Written on 7/9/2016
 */
public class InvalidProductionArgumentException
        extends Exception implements Serializable {
    // declare fields
    private static final long serialVersionUID = 1L;

    /**
     * Constructor
     * @param customErrorMessage
     */
    public InvalidProductionArgumentException(String customErrorMessage) {
    }
}
