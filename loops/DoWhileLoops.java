package loops;

import java.util.Scanner;

public class DoWhileLoops {

	public static void main(String[] args) {

		
//		int n = 0;
//		 do {
//			  System.out.println("n is " + n);
//		 }while (n !=0);
	
		Scanner sc =new Scanner(System.in);
		int n = 1;
		
		do {
			n = sc.nextInt();
			
			System.out.println("number is " + n);
		}while (n !=0);
		
	
	}

}
