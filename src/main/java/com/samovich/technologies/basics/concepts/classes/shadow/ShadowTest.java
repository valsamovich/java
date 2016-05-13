/**
 * @file ShadowTest.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 */

package com.samovich.basics.concepts.classes.shadow;

public class ShadowTest {
    
    public int x = 0;
    
    class FirstLevel {
        
        public int x = 1;
        
        void methodInFirstLevel(int x) {
            
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
            
        }
    }

    public static void main(String[] args) {
        
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        
    }
}
