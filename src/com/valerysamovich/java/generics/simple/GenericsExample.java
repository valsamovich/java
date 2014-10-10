/**
 * @file GenericsExample.java
 * @author Valery Samovich
 * @version 1.0.0
 * @date 08/7/2014
 */

package com.valerysamovich.java.generics.simple;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {

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
