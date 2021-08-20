package conditionalStatement;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

//		  int age = 19;
//		  if(age>=18) {
//	 System.out.println("You can vote now");
//		  }
		
	int age = 12;
	if(age >=18) {
	      System.out.println("You can vote now");
	  	
	  } else {
		  System.out.println("You can't vote now");
	  }
	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int no = sc.nextInt();
	
	if(no % 2 == 0) {
		System.out.println("No. is Even i.e " + no);
	}else {
		System.out.println("No. is Odd i.e " + no);
	}
	
	}
	
}
