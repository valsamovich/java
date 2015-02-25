/**
 * @file HelloRunnable.java
 * @author Valery Samovich
 * @version 1
 * @date 2014/01/09
 */

package com.samovich.basics.essential.concurrency.threads;

/**
 * Provide a Runnable Object
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String[] args) {
        (new Thread(new HelloRunnable())).start();
    }

}
