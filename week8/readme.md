# Classes/Type/ADT: A written description of the attributes and behaviors of an object.
## Blueprint
# Object: An instance of a class.
## A physical representation of the blueprint
# Fields
# Attributes: Instance Variables 
# Behaviors: Instance Methods
## Syntax:

		accessModifier class NameOfClass {
		
		}
		
# Behaviors: Constructor, Setters & Getters, Equals, toString, compareTo
# Constructors: It is a special method, that shares the same name as the class, it does not have a return type, it initializes the instance variables and Instantiate the object
# Setters: Mutators, they modify the values of the instance variables
# Getters: Accessors, they retrieve the values of the instance variables


#Four Pillars of OOPL: Polymorphism, Encapsulation, Abstraction, Inheritance

- Polymorphism: Poly - Multiple, morphism - fores,
- Encapsulation: limiting the access to data by encapsulating it in private attributes and controlling access through setters and getters


	public class Mammal{
		private int numOfLegs;
		private boolean hasFurs;
		private String species;
		
		public Mammal() [
			this.numOfLegs = 2;
			this.hasFur    = true;
			this.species   = "bear";
		}
		
		public Mammal (int numOgLegs, boolean hasFur, String species) [
			this.numOfLegs = numOfLegs;
			this.hasFur    = hasFur;
			this.species   = species;
		}
		
		public void setNumOfLegs (int numOfLegs) {
			this.numOfLegs = numOfLegs;
			
		}
		
		public int getNumOfLegs() {
			return this.numOfLegs;
			
		}
		
	}
		
		
