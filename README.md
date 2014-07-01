java-tutorial
=============

Java development tutorial. It's include the basic java rules, syntax, examples, and object-Oriented Programming principles. Each example are designed to easy understand the Java Programming with no experience . Tutorial is divided in days, which contains examples and exercises.


Java Programming Cheatsheet
---------------------------

### Java (Data, Method, Class, Object, Keywords, Constructor)

	Primitive data types: byte, short, int, long, float, double, char, boolean 
	For loop: for(initial value; condition; increment/decrement)

	Object is a copy or instance of a class.
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
		      |           |           |           |
	protected     |	Y     	  | Y	      | Y         | N
	
	default       |	Y     	  | Y	      | N         | N
	
	private	      |	N     	  | N	      | N         | N
	

### Java OOP - Polymorphism (Overloading, Overriding)

	Overloading is when methods of the same name are differentiated by their 
	passing arguments.

	Overriding is when a method in the subclass has the same signature 
	as a method in the super class, then the subclass method takes precedence

### Java OOP - Inheritance (Abstract classes, Interfaces)

	Inheritance is when a class acquires(extend) the properties of another class.

	Abstract class is a class which has empty methods and fully defined methods.

	Interface is a class with only empty methods.

### Java debugging

	Break points -> Step Into, Over and Return
	Exception and conditional Breakpoints
	Change the variables value
	exception handler components: try { } catch (ExceptionType name) {}

### Java Collections (List, ArrayList, HashMap, generics)

	Non generic list, can add anything:  List list = new ArrayList();
	Generic list, can add specific: List<String> gList = new ArrayList<String>();


### Java applets

	Using the applet tag
	The purpose of the <object> element is to support HTML helpers (plug-ins).
