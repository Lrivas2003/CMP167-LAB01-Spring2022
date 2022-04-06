
public class CatTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("Whiskers", 8, "brown");
		Cat cat3 = new Cat();
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		System.out.println(cat1.equals(cat3));
		System.out.println(cat2.equals(cat1));
		System.out.println(cat2.equals(cat3));
		
		cat1.meow();
	}
}
