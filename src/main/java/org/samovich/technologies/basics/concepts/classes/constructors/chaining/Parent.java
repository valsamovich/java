/**
 * @file Parent.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 11/22/2014
 *
 * Java Constructor chaining.
 */

package org.samovich.technologies.basics.concepts.classes.constructors.chaining;

public class Parent extends GrandParent {

    int classB;

    // Constructor Method.
    Parent(int constructorA, int constructorB) {
        super(constructorA);
        this.classB = constructorB;
    }

    // Show method for Print
    void show() {
        System.out.println("GrandParent's classA = " + classA);
        System.out.println("Parent's classB = " + classB);
    }


}
