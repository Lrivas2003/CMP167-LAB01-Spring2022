/**
 * 
 *	Person
 *	--------------------------
 * 	- legNums: int
 * 	- hairColor: String
 * 	- eyeColor: String
 * 	- height: double
 * 	- firstName: String
 * 	- lastName: String
 *  - age: int
 *  --------------------------
 *  speak(): void
 *  see(): void
 *  walk(): boolean
 *  run(): boolean
 *
 */
public class Person {
	private int legNums;
	private int age;
	private double height;
	private String hairColor;
	private String eyeColor;
	private String firstName;
	private String lastName;
	
	public Person() {
		this.legNums = 2;
		this.age = 18;
		this.height = 1.78;
		this.hairColor = "Mahogany";
		this.eyeColor = "Mahogany";
		this.firstName = "Anastacia";
		this.lastName = "Kravinoc";
	}
	
	public Person(int legNums, int age, double height, String hairColor, String eyeColor, String firstName, String lastName) {
		this.legNums = legNums;
		this.age = age;
		this.height = height;
		this.hairColor = hairColor;
		this.eyeColor = eyeColor;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public void speak(){
		System.out.println("Hi, my name is, " + this.firstName);
	}
	
	public void speak(String message) {
		System.out.println(message);
	}
	public void see() {
		System.out.println("I see an object! oh it's this");
	}
	public boolean walk() {
		int val = (int)Math.random()*1;
		if(val==0) {
			System.out.println("I don't walk");
			return false;
		} 
		else {
			System.out.println("I walk");
			return true;
		}
	}
	public boolean run() {
		int val = (int)Math.random()*1;
		return val==1;
	}
	
	
	
	public int getLegNums() {
		return legNums;
	}

	public void setLegNums(int legNums) {
		this.legNums = legNums;
	}

	public int getAge() {
		return age;	
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public String getHairColor() {
		return hairColor;
	}
	
	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return "Person: name: "+this.firstName +" "+this.lastName;
	}
}
