/**
 * 
 * @author luisr
 *
 */

public class Program6 {
	public static int product(int x, int y)// method Definition, Concrete method, because a body has been defined
	{
		return x*y;
	}
	
	public static int sumAll( int n, int m)
	{
		int sum = 0;
		for(int i = n; i <= m; i++)
		{
			sum += n;
		}
		return sum;
	}
	//Lab Practice
	//Write  a method that will calculate the average of the sum of all numbers from 1 to n, return a double as result
	
	
	public static void main (String [] args) // main method
	{
		greet();
		int total = sumAll(10,20);
		int product = product(5, 3);
		
		System.out.println("Total " + total);
		System.out.println("Product " + product);
	}
	
	private static void greet() {
		System.out.println("Hello");
	}
}
