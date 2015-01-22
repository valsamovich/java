/**
 * @file Sort.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/22
 */

package com.samovich.basics.collections.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * The following trivial program prints out its arguments in lexicographic
 * (alphabetical) order.
 */
public class Sort {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(args);
        Collections.sort(list);

        System.out.println(list);

    }

}
