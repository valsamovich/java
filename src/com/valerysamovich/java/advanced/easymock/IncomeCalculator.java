/**
 * @file IncomeCalculator.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/16/2014
 *
 * Using the Easymock and JUnit
 */

package com.valerysamovich.java.advanced.easymock;

public class IncomeCalculator {

    // Private fields
    private ICalculatorMethod calculatorMethod;
    private Position position;

    // Setter for I CalculatorMethod
    public void setCalculatorMethod(ICalculatorMethod calculatorMethod) {
        this.calculatorMethod = calculatorMethod;
    }
}


