Creational Design Patterns
1. SingleTon - When we need to only single instance of the class and it will be used throughout the application 
	then, we will create single design class.
	
	Steps:- 
		Declare an object of class as static
		Make default constructor private
		create a static method that will check if the static object is null then assign new object
		else return the same object.
	
2. Factory- In a situation where multiple classes are present and the type of object will be decided at the run time
	so, for these kind of situations we need to opt for factory design pattern.
	
	Steps:-
		Create an interface of Target type
		Create classes implementing the interface and override the methods
		create a factory class with a static method which will take a argument to decide the objectType
		Using If-else or switch case handle the object creation and return it.

3. Builder- A creational design pattern that lets you construct complex objects step by step. 
	The pattern allows you to produce different types and representations of an object using the same construction code.
	
	Steps:-
		Create the Product class with constructor argument as ProductBuilder
		With the help of productBuilder object we will set the member variables.
		Create a ProductBuilder class with the same argument and create method for each data member with return type productBuilder 
		At last create a method builder that will create a instance through calling product constructor.