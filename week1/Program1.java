import java.util.Scanner; 

public class Program1 {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to my first Java Program");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = input.next();
		
		System.out.println("Hello, "+name);
		
		input.close();
	}
}
