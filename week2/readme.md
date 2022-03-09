# Variables & Data Types
# Variables: A placeholder in memory that holds data, and it has a specific data type
## Variable Declaration:
### Syntax:
	dataType variableName;
### Semantics:
-	Take a space in memory and give it a name and a specific data type 

### Example:
	int numl;
	
## Variable Assignment:
### Syntax
	variableName = expression;
### Semantics:
-	Evaluate the expression
-	Store the value into the corresponding variable

### Example:
	numl = 4*5/3
	
## Variable Defining:
### Syntax
	dataType variableName = expression;
### Semantics:
-	Take a space in memory and give it a name and a specific data type
-	Evaluate the expression
-	Store the value into the corresponding variable

### Example:
	boolean answer = 5 > 6 ;
	
# Data Types
# - Primitive Data Type
## - Numerical

### - Integers
-	byte				8 bits (-2^7 to 2^7 -1)
-	short				16 bits (-2^15 to 2^15 -1)
-	int					32 bits (-2^31 to 2^31 -1)
-	long				64 bits (-2^63 to 2^63 -1)	

### - Floating Point Numbers
-	float				32 bits
-	double				64 bits

## - Booleans
-	boolean (true or false)		1 bit 

## - Characters
-	char				16 bits

# - Referential Data Type/ ADT(Abstract data type) / classes
-	OutputStream
-	String
-	Scanner
-	Program1
-	Math
-	System
-	<**Wrapper classes**> Integer, Long, Double, Character, Boolean, Float

# Operations with data types:
	int num = 4*3/2; //---> 6
	num = num * 3;	//---> 18
	double num2 = 2.5;
	num * num2 //---> 45.0
	num2 = num / num2; //-->7.2
	int num3 = 5;
	num%num3; //---> 3
	num = num/num3; //--> 3
	
## Comparison Operators
	>		greater than
	<		less than
	>=		greater than or equal to
	<= 		less than or equal to
	
	!=		not equal
	==		equal to
	
## Logical Operators
	&&		and
			or
	!		not
	
### True Table
-	&&
	true && true => true
	true && false => false
	false && false => false
	false && true => false
	
-	||
	true || true => true
	true || false => true
	false && false => false
	false || true => true
	
- !
	!true => false
	!false => true
	
# Characters
	'a' => 97
	'b' => 98
	'a' + 'b' => 195
	'A' => 65
## Bitwise operators
	&		and
	|		or
	^		exclusive or

