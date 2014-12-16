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

    // Setter for private ICalculatorMethod field (object).
    public void setCalculatorMethod(ICalculatorMethod calculatorMethod) {
        this.calculatorMethod = calculatorMethod;
    }

    // Setter for private Position filed (object).
    public void setPosition(Position position) {
        this.position = position;
    }
    /*
     * Calculate method.
     */
    public double calculate() {

        if(calculatorMethod == null) {
            throw new RuntimeException("CalculatorMethod not yet maintained.");
        }

        if(position == null) {
            throw new RuntimeException("Position not yet maintained.");
        }

        return calculatorMethod.calculator(position);

    }
}


