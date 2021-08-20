package loops;

import java.util.Scanner;



public class SumOfNaturalNo {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int myNo = sc.nextInt();
		System.out.println(getSingleDigit(myNo));
	
		
	}
	
	static int getSingleDigit(int number){
		int totalSum = 0;
		
		if(number < 10) {
			return number;
		}
		
		while( number > 0) {
			
			totalSum += number % 10;
			
			number = number/10;
			
			if(number < 10) {
				totalSum += number;
				number = 0;
			}
		
		}
		
		return getSingleDigit(totalSum);
	
   }

}
