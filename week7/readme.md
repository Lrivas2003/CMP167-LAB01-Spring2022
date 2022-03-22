# Array : Collection of elements of the same data type with a fixed size

# Defining an array
	dataType [] nameOfArray = new dataType [] { element1, element2, element3, ..., elementN};
	dataType [] nameOfArray = new dataType [size];
	dataType [] nameOf Array = { element1, element2, element3 }; 
	
# Index : start at zero, the first element of an array is in index zero

# Examples:
## Accessing Arrays:
	int [] numbers = new int [100];
	numbers[2]	--- > 0
	[0,0,0,0,0,0,........0]
	
	double [] numbers1 = new double [100];
	numbers1 [2]	--- > 0.0
	
	String [] names = {"Maria", "Azis", "Galin", "Galena"};
	
	names[0] ---> "Maria"
	names[2] ---> "Galin"
	names[3] ---> "Galena"
	
	int [] ages = { 12,13,25,24,32,50,47};
	
	ages[0] -----> 12
	ages[2] -----> 25
	
	double [] balances = new double [] {2.56, 12.57, 36.57, 57.89};
	
# Getting the length of the array
	namesOfArray.length
	
	names.length ---> 4
	numbers.length ---> 100
	
# Modify the element at a specific index:
	nameOfArray[index] = newElement;
	
	names[3] = "Celine Dion"; ---> {"Maria", "Azis", "Galin", "Celine Dion"};
	
# Last Index
	names.length ---> 4
	lastIndex ----> 3
	lastIndex = length - 1
	
	names[names.length -1] ---> Celine Dion
	
# Looping

	for{ int i = 0; i< names.length ; i++) {
		System.out.println(names [1]);
	}
	
	for ( String name: names ) {
		System.out.println(name);
	}
# Displaying the array


	Arrays.toString(names); 
	
	