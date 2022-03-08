/**
 * 
 * @author Luis Rivas
 *
 */


public class Program5 {
	public static void main(String[] args) {
		int sum = 0 ;
		
		for (int i = 1; i <= 5 ; i += 1) {
			sum = sum + i; // sum += i
		}
		
		System.out.println(sum);
		
		
		double total =0.0;
		
		for (int i = 1; i <= 100; i++) {
			total += i;
		}
		total = total/100;
		
		
		System.out.println("Total average " + total);
		
	}

	
	public static void nothing() {
		System.out.println();
		
	}
}
