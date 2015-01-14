java-tutorial
=============

**Java** is Simple, Object oriented, Distributed, Multithreaded, Dynamic, Architecture neutral, Portable, High performance, Robust, Secure. The **Java Tutorials** are practical guides for programmers who want to use the Java programming language to create applications.

[Oracle Java Documentations](http://docs.oracle.com/javase/tutorial/index.html)

Dependencies
------------

**Dependencies:** JSON Simple, JUnit, Hamcrest, TestNG, Selenium WebDriver, HTTP Client, EasyMock.

Quick Reference
---------------

**Class** is Data and methods that act on the Data. It’s a template for an object. 

**Object** is an Instance or copy of a class. 

Java has 8 **Primitive Data types**: byte, short, char, int, long, float , double, boolean. 



Wrappers: Integer, Double, Float, Long, Boolean, Character, Short, Byte. 

Can be used to convert String to int (eg) int a = Integer.parseInt(“10”); etc.

OOPS concepts: Encapsulation, Polymorphism and Inheritance. 

Encapsulation: The concept of having data and methods that act on the data.

Data hiding. When a class hides its attributes (data) and behavior (methods) to 

other classes.

Access 

Modifier

public X X X X

protected X X X

default X X

private X

class package subclass project

Polymorphism: 

Overloading: When methods of the same name are differentiated by their passing 

arguments. 

Overriding: When a method in the subclass has the same signature as the method 

in the super class, the method in the subclass overrides (takes precedence) over 

the method in the super class. 

Inheritance: when a class acquires the properties of another class.

Abstract class: when a class has method declarations (empty methods) and fully 

defined methods. 

Interface: when a class has only method declarations (empty methods), it’s called 

an interface. 

Variables declared in an interface are by default public static final. 

A class extends another class. A class can extend only one class

A class implements an interface. A class can implement many interfaces.

An interface extends an interface.

static: keyword that can be applied to a variable, method or block of code. It has 

only one instance per class (where as other variables will be one for every object). 

It will be executed first when a class in created and it’s done only once. 

A static method can only call other static methods or variables. 

Constructor: method with the same name as that of its class. It’s executed when 

an object is created. 

final: keyword that can be applied to class, method or variable. For variables, it 

denotes that it’s a constant. For methods, it means it cannot be overridden. For 

classes, it means it cannot be subclassed. 

finally: keyword used in a try-catch block. The code in a finally block will always 

be executed, if there was an exception or not. 

List: An interface used to hold a collection of objects. 

ArrayList: implements the List interface. List a = new ArrayList(); 

Difference between an ArrayList and Vector 

Vector is thread safe and ArrayList is not. (Thread safe in other words 

synchronized. Only one thread can access at a time. This will ensure other objects 

don’t alter values). 

HaspMap and HashTable: Used to hold Key value pair. HashTable is synchronized, 

HashMap is not. 

Package: used like a folder to hold all related classes. 

import: used to import other packages.

Appendix
--------

- [Maven repositories](http://mvnrepository.com/) is used to hold build artifacts and dependencies of varying types.
- [JSON Online Editor](http://jsoneditoronline.org/) is a web-based tool to view, edit, and format JSON with tree view.
- [JSON Lint](http://jsonlint.com/) is a web-based JSON Validator.
- [JSON Path](http://ashphy.com/JSONPathOnlineEvaluator/) is a web-based online tool JSON path evaluator.
- [Vogella](http://www.vogella.com/) Provides premium Java, Eclipse, Android and Git training and development support.
- [Java Brains](http://javabrains.koushik.org/) Learn and advance your Java skills online.

