package week4;





import java.util.Scanner;
public class Program4 {
	public static void main(String [] args) {
		 int userAge;
	    
	      Scanner scnr = new Scanner(System.in);
	      
	      System.out.println("Welcome");
	      System.out.print("Enter your age: ");
	      userAge = scnr.nextInt();

	      if (userAge <21) {      
	         System.out.println("Too young drink alcohol");
	         
	      }
	      else if (userAge >= 21) {
	    	  System.out.println("This individual can drink alchohol");
	    	  
	      }
	       
		
	}
}
