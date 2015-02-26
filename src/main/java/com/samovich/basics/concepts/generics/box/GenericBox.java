package com.samovich.basics.concepts.generics.box;

/*
 * Generic version of the Box class.
 * @param<T> the type of the values being boxed.
 */
public class GenericBox<T> {

    // T stands for "Type
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
