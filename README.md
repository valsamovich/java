java-tutorial
=============

Java development tutorial. It's include the basic java rules, syntax, examples, and object-Oriented Programming principles. Each example are designed to easy understand the Java Programming with no experience . Tutorial is divided in days, which contains examples and exercises.

Object-Oriented Programming Concepts
------------------------------------

###Object

Objects are key to understanding object-oriented technology and a software bundle of related state and behavior. An object stores its state in fields (variables in some programming languages) and exposes its behavior through methods (functions in some programming languages). Bundling code into individual software objects provides a number of benefits: modularity, information-hiding (data encapsulation), code re-use, and pluggability and debugging ease.

###Class

A class is a blueprint or prototype from which objects are created. Example: There may be thousands of other phones in existence, all of the same make and model. Each phone was built from the same set of blueprints and therefore contains the same components. In object-oriented terms, we say that your phone is an instance of the class of objects known as phones.

###Inheritance

Inheritance provides a powerful and natural mechanism for organizing and structuring your software. Object-oriented programming allows classes to inherit commonly used state and behavior from other classes. For example, Phone is the superclass of Touch Phone, Smart Phone, and TandemBike. In the Java programming language, each class is allowed to have one direct superclass, and each superclass has the potential for an unlimited number of subclasses:

Java Basics
-----------

###Primitive Data Types

The Java programming language is statically-typed, which means that all variables must first be declared before they can be used.

	byte, short, int, long, float, double, char, boolean 

Default Values:

	Data Type             | Default Value (for fields)	   
	----------------------|---------------------------
	byte	              | 0    	  
	short                 |	0    	  
	int                   |	0  
	long                  | 0L
	float                 | 0.0f
	double                | 0.0d
	char                  | '\u0000'
	String(or any object) |	null
	boolean               | false

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

###Operators

Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.

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

###Control Flow Statements

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
