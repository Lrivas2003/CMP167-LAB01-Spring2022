

/**
 * 
 * @author luisr

 *
 */
import java.util.Scanner;
public class Program6_Lab {
	
		 public static void main(String[] args) {
			 Scanner scnr = new Scanner(System.in);
			 
			 int y;
			 int i = 1;
		     double sum = 0;
		     
		     System.out.println("Enter a number: ");
		     y = scnr.nextInt();
		       
				while(i <= y) {
		            sum = sum + i; i++;
	       }
		
		   System.out.println("Average:" + (sum/y));    
		 
		    }
	}
	
