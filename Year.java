package Lab2;

public class Year {
	public static void main(String[]args) {
		//Set Max and min value for the range. 
		int max = 2000; 
		int min = 1900; 
		int range = max - min + 1 ; 
		boolean leap ;
		
		//using for loop to generate a random number. 
		for(int i = 0 ; i < 1; i ++) {
			int year = (int)(Math.random()*range) + min ; 
			
			if(year % 4 == 0 ) {
				System.out.println("The year is " + year + " and it's a leap year. ");
			}else {
				System.out.println("The year is " + year + " and it's not a leap year. ");
			}
		}
	}
}
