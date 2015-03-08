/**
 * @file Pair.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/07
 */

package com.samovich.basics.concepts.generics.multiple;

public interface Pair<K, V> {
    public K getKey();
    public V getValue();
}
