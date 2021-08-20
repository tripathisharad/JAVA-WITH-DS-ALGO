package userInput;
import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		System.out.println(x);
		
//		double y = sc.nextDouble();
//		System.out.println(y);
		
		
//		int principal = 600;	
//		float rate = 3.12f;
//	    int time = 5;
	    
//	    float simpleIntrest = principal*rate*time/100;
	    
//	    System.out.println(" The Simple Intrest is " + simpleIntrest);
	    
	    
	    Scanner sc = new Scanner(System.in);
	    
	    int principal = sc.nextInt();
	    float rate = sc.nextFloat();
	    int time = sc.nextInt();
	    
	    float simpleIntrest = principal*rate*time/100;
	    
	    System.out.println(" The Simple Intrest is " + simpleIntrest);
	    
	    		
	    
	    
	    
	    		
	    		
		
	}

}
