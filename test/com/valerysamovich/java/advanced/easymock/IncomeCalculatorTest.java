/**
 * @file IncomeCalculatorTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/20/2014
 */

package com.valerysamovich.java.advanced.easymock;

// Static imports to have direct access to the methods
import static org.easymock.EasyMock.createNiceMock;

public class IncomeCalculatorTest {

    // Private fields
    private ICalculatorMethod calculatorMethod;
    private IncomeCalculator calculator;
    
    public void setUp() throws Exception {
        //  NiceMocks return default values for unimplemented methods
        calculatorMethod = createNiceMock(ICalculatorMethod.class);
    }
}
