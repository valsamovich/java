/**
 * @file IncomeCalculatorTest.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 12/20/2014
 */

package com.samovich.java.advanced.easymock;

import org.junit.Before;
import org.junit.Test;

// Static imports to have direct access to the methods
import static org.easymock.EasyMock.createNiceMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class IncomeCalculatorTest {

    // Private fields
    private ICalculatorMethod calculatorMethod;
    private IncomeCalculator calculator;
    
    @Before
    public void setUp() throws Exception {
        //  NiceMocks return default values for unimplemented methods
        calculatorMethod = createNiceMock(ICalculatorMethod.class);
    }

    @Test
    public void testCalculator1() {
        // Setting up the expected value of the method call calculator
        expect(calculatorMethod.calculator(Position.BOSS)).andReturn(70000.0).times(2);
        expect(calculatorMethod.calculator(Position.PROGRAMMER)).andReturn(50000.0);
        // Setup is finished need to activate the mock
        replay(calculatorMethod);

        calculator.setCalculatorMethod(calculatorMethod);
        try {
            calculator.calculate();
            fail("Exception did not occur");
        } catch (RuntimeException e) {

        }
        calculator.setPosition(Position.BOSS);
        assertEquals(70000.0, calculator.calculate(), 0);
        assertEquals(70000.0, calculator.calculate(), 0);
        calculator.setPosition(Position.PROGRAMMER);
        assertEquals(50000.0, calculator.calculate(), 0);
        calculator.setPosition(Position.SURFER);
        verify(calculatorMethod);
    }

    @Test(expected = RuntimeException.class)
    public void testNoCalculator() {
        calculator.setPosition(Position.SURFER);
        calculator.calculate();
    }

    @Test(expected = RuntimeException.class)
    public void testNoPosition() {
        expect(calculatorMethod.calculator(Position.BOSS)).andReturn(70000.0);
        replay(calculatorMethod);
        calculator.setCalculatorMethod(calculatorMethod);
        calculator.calculate();
    }

    @Test(expected = RuntimeException.class)
    public void testCalculator2() {
        // Setting up the expected value of the method call calculator
        expect(calculatorMethod.calculator(Position.SURFER)).andThrow(new RuntimeException("Don't know this guy")).times(1);

        // Setup is finished need to activate the mock
        replay(calculatorMethod);
        calculator.setPosition(Position.SURFER);
        calculator.setCalculatorMethod(calculatorMethod);
        calculator.calculate();
    }@Test
     public void testCalc1() {
        // Setting up the expected value of the method call calculator
        expect(calculatorMethod.calculator(Position.BOSS)).andReturn(70000.0).times(2);
        expect(calculatorMethod.calculator(Position.PROGRAMMER)).andReturn(50000.0);
        // Setup is finished need to activate the mock
        replay(calculatorMethod);

        calculator.setCalculatorMethod(calculatorMethod);
        try {
            calculator.calculate();
            fail("Exception did not occur");
        } catch (RuntimeException e) {

        }
        calculator.setPosition(Position.BOSS);
        assertEquals(70000.0, calculator.calculate(), 0);
        assertEquals(70000.0, calculator.calculate(), 0);
        calculator.setPosition(Position.PROGRAMMER);
        assertEquals(50000.0, calculator.calculate(), 0);
        calculator.setPosition(Position.SURFER);
        verify(calculatorMethod);
    }

    @Test(expected = RuntimeException.class)
    public void testNoCalc() {
        calculator.setPosition(Position.SURFER);
        calculator.calculate();
    }

    @Test(expected = RuntimeException.class)
    public void testCalc2() {
        // Setting up the expected value of the method call calculator
        expect(calculatorMethod.calculator(Position.SURFER)).andThrow(new RuntimeException("Don't know this guy")).times(1);

        // Setup is finished need to activate the mock
        replay(calculatorMethod);
        calculator.setPosition(Position.SURFER);
        calculator.setCalculatorMethod(calculatorMethod);
        calculator.calculate();
    }

}
