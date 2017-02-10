/**
 * @file GenericsExample.java
 * @author Valery Samovich
 * @version 2
 * @date 08/7/2014
 *
 * Generics are a facility of generic programming that were added to the Java
 * programming Language in 2004 within J2SE 5.0. They allow "a type or method
 * to operate on objects of various types while providing compile-time type
 * safety." This feature specifies the type of objects stored in a Java
 * Collection.
 *
 *  class name<T1, T2, ..., Tn> { // body... }
 */

package org.samovich.technologies.basics.concepts.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        
        // Example with cast (no generics)
        @SuppressWarnings("rawtypes")
        List castList = new ArrayList();
        castList.add("hello");
        String s1 = (String) castList.get(0);
        System.out.println(s1);
        
        // Example with generics (no cast)
        List<String> genericList = new ArrayList<String>();
        genericList.add("hello");
        String s2 = genericList.get(0);
        System.out.println(s2);

    }

}
