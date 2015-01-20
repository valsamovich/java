package com.samovich.java.basics.collections;

import java.util.*;

public class Bucky {
    
    public static void main(String[] args) {
        
        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<String>();
        
        // Add array items to list
        for(String x : things) {
            list1.add(x);
        }
        
        String[] morethings = {"lasers","hats"};
        List<String> list2 = new ArrayList<String>();

        // Add array items to list
        for(String y : morethings) {
            list2.add(y);
        }
        
        for(int i = 0; i <list2.size(); i++) {
            System.out.printf("%s ", list2.get(i));
        }
    }
    
}
