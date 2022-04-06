/**
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
 */
public class Dog {
	//attributes
	private String name;
	private int age;
	private String species;
	
	//Constructors
	public Dog() {
		this.name = "Lassie";
		this.age  = 10;
		this.species = "chihuahua";
	}
	public Dog(String name, int age, String species) {
		this.name = name;
		this.age  = age;
		this.species = species;
		
	}
	//setters and getters
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return age;
		
	}
	public String getSpecies() {
		return species;
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		
		if(obj instanceof Dog) {
			Dog otherDog = (Dog) obj;
			return otherDog.name.equals(this.name) && otherDog.age == this.age
					&& otherDog.species.equals(this.species);
			
		}
		return false;
		
	}
	public String toString() {
		return "Dog: name = "+this.name+ ", age = "+this.age +", species = "+this.species;
	}
	public void bark() {
		System.out.println("woof woof");
	}
}
