//Using the Example from the Dog CLass, create a Cat class
//With at least 3 attributes, setters, and getters, two constructors
//equals method, toString method and custom method
public class Cat {
	private String name;
	private int height;
	private String color ;
	
	public Cat() {
		this.name = "Luis";
		this.height  = 9;
		this.color = "black";
	}
	public Cat(String name, int height, String color) {
		this.name = name;
		this.height  = height;
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return this.name;
	}
	public int getHeight() {
		return height;
	}
	public String getColor() {
		return color;
	}
	
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(obj == null) return false;
		
		if(obj instanceof Cat) {
			Cat otherCat = (Cat) obj;
			return otherCat.name.equals(this.name) && otherCat.height == this.height
					&& otherCat.color.equals(this.color);
			
		}
		return false;
		
	}
	public String toString() {
		return "Cat: name = "+this.name+ ", height = "+this.height +" inches, color = "+this.color;
	}
	public void meow() {
		System.out.println("purr purr");
	}
	}

