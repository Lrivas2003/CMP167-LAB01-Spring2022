# Classes: Written description of the attributes and behaviors of an object 
# Attributes: Instance variable
# Behaviors: Instance methods
## Constructors: A special method that shares the same name as the class: initialize the instance variables, instantiating the object.
## Setters: Change the value of the instance variables
## Getters: Retrieve the values of the instance variables
## equals: returns true if the values of the instance variables are the same, else returns false
## toString: returns the string representation of the  object.


UML Diagram
--------------------
	Class Name 
------------------
- variableName : data type
- variableName : data type
-----------------------
	+ Constructor()
	+ setVariableName( localVariableName: data type) : void
	+ setVariableName( localVariableName: data type) : void
	+ getvariableName(): data type
	
-------------------

____________________________
			Dog
______________________
	- name : String
	- age : int
	- species : String
____________________________

+ Constructors()
+ setters & getters
+ equals(onj: Object): boolean
+ toString(): String
+ bark(): void
____________________________
