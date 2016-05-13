/**
 * @file ListDemo.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/20
 */

package com.samovich.basics.collections.interfaces.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        
        List listA = new ArrayList();
        
        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");
        
        // access via index
        String element0 = (String) listA.get(0);
        String element1 = (String) listA.get(1);
        String element2 = (String) listA.get(2);
        
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
