package Lab2;
import java.util.Scanner;
public class Digits {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int n ;
		int count = 0 ; 
		
		System.out.println("Input the integer ! ");
		n = s.nextInt();
		
		while(n != 0) {
			n /= 10; 
			++count;
		}
		System.out.println("integer of digit is : " + count);
	}
}
