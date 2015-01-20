/**
 * @file ListDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/20
 */

package com.samovich.java.basics.collections.list;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class ListDemo {

    public static void main(String[] args) {
        
        List listA = new ArrayList();
        
        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");
        
        // access via index
        Object element0 = listA.get(0);
        Object element1 = listA.get(1);
        Object element2 = listA.get(2);
        
        // access via Iterator
        Iterator iterator = listA.iterator();
        while(iterator.hasNext()) {
            String element = (String) iterator.next();
            System.out.println(element);
        }
        
        // access via for loop
        for(Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }
        
    }
}
