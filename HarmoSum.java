package Lab2;
import java.util.Scanner;
public class HarmoSum {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n ; 
		double sum;
		int i = 1; 
		
		System.out.println("Enter number of n : ");
		n = s.nextInt();
		
		sum = 0; 
		while(i <= n) {
			sum = sum + (double)1/i; 
			i++;
		}
		System.out.println("harmonic series is : " + sum);
	}
}
