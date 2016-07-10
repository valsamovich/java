package com.samovich.cop2800.chapter12.exception;

/*
AUTHOR: Dick Grant
PURPOSE: Demonstrate the creation of a custom exception.  The class below 
defines the OutOfSequenceException exception.  It contains the minimum you 
should have in your exception class.
SOURCE:D:\chap15\chap15_code_examples\OutOfSequenceException.java
*/
public class OutOfSequenceException extends Exception{

        public OutOfSequenceException( ) { }  //default constructor

        public OutOfSequenceException(String str){  //overloaded constructor
            //the value of str will be set by the class that uses this exception
                super (str);  //call the superclass constructor and pass 
                              //the String object
        }
}