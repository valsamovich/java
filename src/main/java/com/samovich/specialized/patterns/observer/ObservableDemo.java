/**
 * @file Template.java
 * @author Valery Samovich
 * @version 1
 * @date 2015/01/09
 * 
 * The observer pattern is a software design pattern in which an object, 
 * called the subject, maintains a list of its dependents, called observers, 
 * and notifies them automatically of any state changes, usually by calling 
 * one of their methods.
 */

package com.samovich.specialized.patterns.observer;

import java.util.Observable;
import java.util.Observer;

public class ObservableDemo extends Object {

    MyView view;
    MyModel model;
    
    // Constructor.
    public ObservableDemo() {
        view = new MyView();
        model = new MyModel();
        model.addObserver(view);
    }

    public static void main(String[] args) {
        
        ObservableDemo myObservable = new ObservableDemo();
        myObservable.demo();
    }

    private void demo() {
        model.changeSomething();
    }
    
    // The Observer normally maintains a view on the data.
    class MyView implements Observer {
        // For now, we just print the fact that we got notified.
        public void update(Observable obs, Object x) {
            System.out.println("Update(" + obs + ", " + x + ");");
        }
    }
    
    // The Observable normally maintains the data
    class MyModel extends Observable {
        public void changeSomething() {
            // Notify observers of change
            setChanged();
            notifyObservers();
        }
        
    }
}
