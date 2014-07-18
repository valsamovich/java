java-tutorial
=============

Java development tutorial. It's include the java [Object-Oriented Programming Concepts](https://github.com/valerysamovich/java-tutorial#object-oriented-programming-concepts), [Java Basics](https://github.com/valerysamovich/java-tutorial#basics), [Classes](https://github.com/valerysamovich/java-tutorial#classes) and [Objects](https://github.com/valerysamovich/java-tutorial#objects), Annotations, Interfaces and Inheritance, Numbers and Strings, Generics, Packages, JUnit Testing. Each example are designed to easy understand the Java Programming with no experience . Tutorial is divided in lessons (com.valerysamovich.java package) or days (com.valerysamovich.patric package), which contains examples and exercises.

Object-Oriented Programming Concepts
------------------------------------

###Object

Objects are key to understanding object-oriented technology and a software bundle of related state and behavior. An object stores its state in **fields** (variables in some programming languages) and exposes its behavior through **methods** (functions in some programming languages). Bundling code into individual software objects provides a number of benefits: modularity, information-hiding (data encapsulation), code re-use, and pluggability and debugging ease.

###Class

A class is a blueprint or prototype from which objects are created. In object-oriented terms, Any Sub-Object is an instance of the class of objects known as Main-Object.

###Inheritance

Inheritance provides a powerful and natural mechanism for organizing and structuring your software. Object-oriented programming allows classes to inherit commonly used state and behavior from other classes. In the Java programming language, each class is allowed to have one direct superclass, and each superclass has the potential for an unlimited number of subclasses.

###Interface

An interface is a contract between a class and the outside world. When a class implements an interface, it promises to provide the behavior published by that interface.

###Package

A package is a namespace that organizes a set of related classes and interfaces. Placing your code into packages makes large software projects easier to manage. The Java platform provides an enormous class library (a set of packages) suitable for use in your own applications. This library is known as the "Application Programming Interface", or "API" for short. Java Platform API Specification - http://docs.oracle.com/javase/8/docs/api/index.html

Basics
------

###Variables
The Java programming language use both **"fields"** and **"variables"** as part of its terminology. 

**Instance variables (non-static fields)** Objects store their individual states in "non-static fields", that is, fields declared without the static keyword. Non-static fields are also known as **instance variables** because their values are unique to each instance of a class (to each object, in other words).

	int value = 10;

**Class Variables (Static Fields)** A class variable is any field declared with the static modifier; this tells the compiler that there is exactly one copy of this variable in existence, regardless of how many times the class has been instantiated. Additionally, the keyword final could be added to indicate that the value will never change.

	static int value = value++;
 
**Local Variables** Similar to how an object stores its state in fields, a method will often store its temporary state in local variables. The syntax for declaring a local variable is similar to declaring a field. Local variables are only visible to the methods in which they are declared; they are not accessible from the rest of the class.

	int count = 0;

**Parameters** Parameters are always classified as "variables" not "fields". This applies to other parameter-accepting constructs as well (such as constructors and exception handlers).

	// args variable is the parameter to main method
	public static void main(String[] args) {} 

###Primitive Data Types

The eight primitive data types are: **byte, short, int, long, float, double, boolean, and char**. The Java programming language is statically-typed, which means that all variables must first be declared before they can be used. 
	int gear = 1;

Data Type | Default Value | Bit                            | Min and Max Value              
----------|---------------|--------------------------------|-----------------------------------------------------
byte	  | 0    	  | 8-bit                          | -128 and -127 (inclusive)
short     | 0    	  | 16-bit                         | -32,768 and 32,767 (inclusive)
int       | 0             | 32-bit                         | -2(in 31st) and 2(in 31st)-1
long      | 0L            | 64-bit                         | -2(in 63rd) and 2(in 63rd)-1
float     | 0.0f          | 32-bit IEEE 754 floating point | specified in the Floating-Point types
double    | 0.0d          | 64-bit IEEE 754 floating point | specified in the Floating-Point types
char      | '\u0000'      | 16-bit Unicode character       | '\u0000' (or 0) and '\uffff'  (or 65,535 inclusive)
String    | null          |                                |
boolean   | false         | 1-bit and "size" isn't defined | true and false
Object    | null          |                                |

###Arrays

An array is a container object that holds a fixed number of values of a single type. The length of an array is established when the array is created. After creation, its length is fixed. 
	
	class ArrayDemo {
		publis stativ void main (String[] args) {
			// declares an array og integers
			int[] anArray;
			
			// allocate memory for 3 integers
			anArray = new int[3];
			
			// initialize first element
			anArray[0] = 10;
			// intialize second element
			anArray[1] = 20;
			// and so forth
			andArray[2] = 30;
		}
	}

**Copying Arrays**

	// system class has an arraycopy() method
	// can use to efficiently copy data from one array into another
	public static void arraycopy(Object src, int srcPos,
        	Object dest, int destPos, int length)
        	
###Operators

Operators are special symbols that perform operations on one, two, or three operands, and then return a result.

Operators by Presedence | Precedence	   
------------------------|----------------------------------------
postfix	                | expr++ expr--   	  
unary                   | ++expr --expr +expr -expr ~ !    	  
multiplicative          | * / %
additive                | 0L
shift			| << >> >>>
relational		| < > <= >= instanceof
equality		| == !=
bitwise AND		| &
bitwise exclusive OR	| ^
bitwise inclusive OR	| |
logical AND		| &&
logical OR		| ||
ternary			| ? :
assignment		| = += -= *= /= %= &= ^= |= <<= >>= >>>=

**The Assignment Operators**

Operator | Description	   
---------|------------------------------------------------
      =  | Assignment operator (value, object references)

**The Arithmetic Operators**

Operator | Description	   
---------|--------------------------------------------------------
      +  | Additive operator (also used for String concatenation)
      -  | Subtraction operator
      *  | Multiplication operator
      /  | Division operator
      %  | Remainder operator
  
**The Unary Operators**

Operator | Description	   
---------|-------------------------------------------------------------------------------------------
      +  | Unary plus operator; indicates positive value (numbers are positive without this, however)
      -  | Unary minus operator; negates an expression
     ++  | Increment operator; increments a value by 1
     --  | Decrement operator; decrements a value by 1
      !  | Logical complement operator; inverts the value of a boolean
      
**The Equality and Relational Operators**

Operator | Description	   
---------|--------------------------
==       | Equal to
!=       | Not equal to
 >       | Greater than
>=       | Greater than or equal to
<        | Less than
<=       | Less than or equal to

**The Conditional Operators** (perform operation on two boolean expressions)

Operator      | Description	   
--------------|------------------------------------------------------------------------------------
&&            | Conditional-AND
&#124; &#124; | Conditional-OR
?:            | Ternary operator (shorthand if-then-else) result = someCondition ? value1 : value2
instanceof    | Type comparison operator
      
**Bitwise and Bit Shift Operators**

Operator | Description	   
-------- |------------------------------------------------------------------
~        | Unary bitwise complement
<<       | Signed left shift
>>       | Signed right shift
>>>      | Unsigned right shift
&        | Bitwise AND - performs a bitwise AND oeration 
^        | Bitwise exclusive  OR - perform a bitwise exclusive OR operation
&#124;   | Bitwise inclusive  OR - perform a bitwise inclusive OR operation

###Expressions, Statements, and Blocks

An **expresions** is a construct made up of variables, operators, and method invocations, which are constructed according to the syntax of the language, that evaluates to a single value.


	// arithmetic expression
	int result = 1 + 2; 


A **statement** is a forms a complete unit of execution. The following types of expressions can be made into a statement by terminating the expression with a semicolon (;).

	// object creation statement
	Object myObject = new Object();

A **block** is a group of zero or more statements between balanced braces and can be used anywhere a single statement is allowed. 

	// if block
	if(condition) {...}

###Control Flow Statements

The statements inside your source files are generally executed from top to bottom, in the order that they appear. **Control flow statements**, however, break up the flow of execution by employing decision making, looping, and branching, enabling your program to conditionally execute particular blocks of code. The section describes the decision-making statements (if-then, if-then-else, switch), the looping statements (for, while, do-while), and the branching statements (break, continue, return) supported by the Java programming language.

**The if-then Statement**

	if (condition) {
		// statement(s)
	}

**The if-then-else Statement**

	if (condition) {
		// statement(s)
	} else {
		// statement(s)
	}
	
**The switch Statement**

	switch (value) {
            case 1:  // statement(s)
                     break;
            case 2:  // statement(s)
                     break;
            // ...and so on
        }
	
The for Statement:

	// infinite loop
	for (initialization; termination; increment) {
    		// statement(s)
	}
	
	// example
	class ForDemo {
    		public static void main(String[] args){
         		for(int i=1; i<11; i++){
              			System.out.println("Count is: " + i);
         		}
    		}
	}

Objects
-------

Classes
-------

Annotations
-----------

Object is a copy or instance of a class:

	Object object  = new Object();
	
	Class is a template for an object. Class has data & methods.
	"Super" keyword id used to access superclass data and methods
	"This" keyword is used to access  class level data

	"Static" is one per class, but not one per object 
	"Static" methods can only access other static data & methods

	"Final" keyword can be applied to data,methods, and classes.
	Final data is constant. Cannot be changed.
	Final methods cannot be overridden. Final classes cannot be sub classed.

	Constructor is a method that has the same name as the class.
	It is executed when an object is created.
	It is used to set default values.
	Does not return anything including void.



### Java OOP - Encapsulation (Data hiding - Access modifiers)

Encapsulation is a data & methods that act on the data.

            Getter and Setter - Accessor and Mutator

Data hiding is help to protect the data and used "access modifiers".
	
	Modifier      |	Class 	  | Package   | Subclass  | Project   
	--------------|-----------|-----------|-----------|------------
	public	      | Y     	  | Y	      | Y         | Y
	protected     |	Y     	  | Y	      | Y         | N
	default       |	Y     	  | Y	      | N         | N
	private	      |	N     	  | N	      | N         | N
	

### Java OOP - Polymorphism (Overloading, Overriding)

- Overloading is when methods of the same name are differentiated by their passing arguments.
- Overriding is when a method in the subclass has the same signature as a method in the super class, then the subclass method takes precedence

### Java OOP - Inheritance (Abstract classes, Interfaces)

- Inheritance is when a class acquires(extend) the properties of another class.
- Abstract class is a class which has empty methods and fully defined methods.

Interface is a class with only empty methods.

	public interface NameOfInterface {
   		// empty methods 
	}

### Java debugging

- Break points -> Step Into, Over and Return
- Exception and conditional Breakpoints
- Change the variables value

Exception handler components: 

	try { 
		// code block to be executed
	} catch (ExceptionType name) {
		// code block to be executed - exception
	}

### Java Collections (List, ArrayList, HashMap, generics)

Non generic list, can add anything:  

	List list = new ArrayList();
	
Generic list, can add specific: 

	List<String> gList = new ArrayList<String>();


### Java applets

Using the applet tag
	
	<!-- The purpose of the <object> element is to support HTML helpers (plug-ins).-->
	<object>Name of the object-applet</object>

Testing
-------

####Unit testing with JUnit

A unit test is a piece of code written by a developer that executes a specific functionality in the code to be tested. The percentage of code which is tested by unit tests is typically called test coverage. A unit test targets a small unit of code, e.g., a method or a class, (local tests).

Java Class

	package com.valerysamovich.java.junit.first;
	
	// My Class
	public class MyClass {
  		public int multiply(int x, int y) {
    			// the following is just an example
    			if (x > 999) {
      				throw new IllegalArgumentException("X should be less than 1000");
    			}
    			return x / y;
  		}
	} 
	
JUnit Test

	package com.valerysamovich.junit.first;

	import static org.junit.Assert.assertEquals;
	import org.junit.Test;

	public class MyClassTest {
  
  		@Test(expected = IllegalArgumentException.class)
  		public void testExceptionIsThrown() {
    			MyClass tester = new MyClass();
    		tester.multiply(1000, 5);
  		}
  	}
