# Method: a black of code to specifically execute and task, it helps to promote routing of code, Once created it can be called anywhere in the code 

## Syntax of Method definition:
	accessModifier staticOrNot dataTypeOfReturnValue nameOfMethod ( parameterList ) ExceptionList
	{
	body
	}
	
-	**accessModifier**: public, private, protected, default or package - (optional)
-	**staticOrNot**: The static elements will belong to the class and not to the instance. Static elements such as methods and variables will be able to access without creating objects.	-	(optional)
-	**dataTypeOfReturnValue**: If it doesn't anything it will be set as void (required)
-	**nameOfMethod**: it should start with letters, _,$	(required)
-	**parameterList**: Declaration of variables that will be used to execute the tasks, these or parameters are assigned a value at the moment the method called (required) 
-	**ExceptionList**: Set Exception classes that will be triggered when an unexpected error occurs. (optional)
-	**body**: Surrounded by curly braces, contains set of statements to execute a task. (required)



## Examples:

	public static int sum(int a, int b);	//Declaration of a method, abstract method, because no body has been defined
	
	public static int product (int x, int y)	// method definition, Concrete method, because a body has been defined
	{
		int sum = 0;
		for (int i = n; i <= m; i++)
		}
		return sum;
	}
	public static void main ( String [] args) // main method
	{
		System.out.print(args[0]);
		
		}
		private static void greet ( ) {
			System.out.println("Hello");
		}
		
# Method Signature: nameOfMethod( DataTypes of parameters )

#Method Call:
## Syntax:
	nameOfMethod(ArgumenList);
	
-	**ArgumentList**; values that will be assigned to the parameterList

## Semantics:
-	Hold a space in memory and give it as name the method call
-	Search a method definition that matches the method signature of the method call
-	If a match is found, assigned the argument values to the parameters variables and execute the statements
- 		If there is a return statement, evaluate the expression and replace the method call with the resultants value, end the method call, free the space in memory
-		If not return statement, end method call
- 		If a match is not found, an error will occur, resulting in either not compiling

## Examples:
	greet();
	int total = sumAll(10, 20);
	int p		 = product (3,5):
	int total2= ("4", 5); //Error, no match found
	
#Return Statement

## Syntax:
	return expression;
## Semantics:
-	Evaluate the expression
-	replace the method call with the resultant value
-	End the method call`																																` 
	
	
	
	