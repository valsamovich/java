/**
 * @file OrderedPair.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/03/07
 */

package com.samovich.basics.concepts.generics.multiple;

public class OrderedPair<K, V> implements Pair<K, V> {
    
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    
    public K getKey() {
        return key;
    }
    
    public V getValue() {
        return value;
    }
}
