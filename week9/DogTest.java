
public class DogTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Willie", 7, "dachshund");
		Dog dog3 = new Dog();
		
		System.out.println(dog1);
		System.out.println(dog2);
		System.out.println(dog3);
		
		System.out.println(dog1.equals(dog3)); //Expected: true
		System.out.println(dog2.equals(dog1)); //Expected: false
		dog3.setName("Tony");
		System.out.println(dog1.equals(dog3)); //Expected: false
		
		dog2.bark();
	}
}
