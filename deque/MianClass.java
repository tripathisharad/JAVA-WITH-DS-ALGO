package deque;

import java.awt.Button;
import java.util.*;

public class MianClass{

	public static void main(String[] args) {
		
		
		Button button;
		
		
		
       
		
		Scanner sc = new Scanner(System.in);
	    int pc = sc.nextInt();
	    int queries = sc.nextInt();
	    sc.nextLine();
	    
	    int [] size = new int[pc];
      
	    for(int i = 0; i<pc; i++) {
    	   size[i] = 1;
       }
	    
	    for(int i = 0; i<queries; i++) {
	    	
	    	String type = sc.next();
	    	
	    	if(type.equals("Q")) {
	    		int cs = sc.nextInt();
	    		System.out.println(size[cs-1]);
	    		
	    	}else if(type.equals("M")) {
	    		int a = sc.nextInt();
	    		int b = sc.nextInt();
	    		
	    		size[a-1]++;
	    		size[b-1]++;
	    	}
	    	
	    	
	    }

	
	}
}