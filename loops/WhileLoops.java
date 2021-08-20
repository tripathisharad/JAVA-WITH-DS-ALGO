package loops;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		
		Scanner ab = new Scanner(System.in);
		int n = ab.nextInt();
		
//		int temp = n;
//		int sum = 0;
//		while(temp>0) {
//			
//			int lastDigit = temp%10;
//			temp /= 10;
//			
//			sum += lastDigit;
//			System.out.println(lastDigit + " " +temp + " " + sum);
//		}
//		
//		System.out.println("The sum of the digit of " + sum);
//		
		
	int numberOfDigit = (int)Math.log10(n);
	System.out.println(numberOfDigit + 1);
		
	}

}
