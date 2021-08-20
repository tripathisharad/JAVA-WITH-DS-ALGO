package praticePackage;
import java.util.*;

public class AssignmentOne {

	public static void main(String[] args) {
		
	 Scanner sc = new Scanner(System.in);
	 
	 System.out.println("Enter The Height Of Pyramid");
	 int lengthOfPyramid = sc.nextInt();
	 int spaces = lengthOfPyramid -1;
	 int star = 1;
	
	
	        for(int i = 0; i<lengthOfPyramid; i++) {
	        	
	        	for(int j = 0; j<spaces; j++) {
	        		System.out.print(" ");
	        	}
	        	
	        	for(int k = 0; k<star; k++) {
	        		System.out.print("*");
	        	}
	        	
	        	
	        	for(int l = 0; l<spaces; l++) {
	        		System.out.print(" ");
	        	}
	        	
	        	System.out.println();
	        	spaces--;
	        	star = star+2;
	        	
	        }
		
		
		
		

	}

}
