
public class Puppy extends Dog {
	double weight;
	
	public Puppy() {
		super();
		this.weight = 0.5;
	}
	public Puppy(String name, int age, String species, double weight) {
		super(name, age, species);
		this.weight = weight;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (super.equals(obj) && obj instanceof Puppy) {
				Puppy otherPuppy = (Puppy) obj;
				return Math.abs(otherPuppy.weight - this.weight) < 0.00001;
		}
		return false;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", weight: " + this.weight;
	}
	
	public static void main(String[] args) {
		Puppy pp1 = new Puppy();
		Puppy pp2 = new Puppy("Willie", 0, "husky", 5.0);
		System.out.println(pp1);
		System.out.println(pp2);
		
		
	}
}
