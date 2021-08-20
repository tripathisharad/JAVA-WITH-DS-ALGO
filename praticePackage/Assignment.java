package praticePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		
		nonrepeatingCharacter("abcad");

  
	}
	
	 static char nonrepeatingCharacter(String S)
	    {
		 
		   int temp = S.length();
		   boolean myBool = false;
		   
		   if(S.length() == 1) {
			   return S.charAt(0);
		   }
		   
		   
	        
	       for(int i = 0; i<S.length(); i++) {
	    	   
	    	   if(S.charAt(i) == S.charAt(i+1)) {
	    		   i = i+1;
	    		   myBool = true;
	    	   }else {
	    		   
	    		   for(int j = i+1; j<temp; j++) {
	 	    		  
	 	    		  if(S.charAt(i) == S.charAt(j)) {
	 	    			  myBool = true;
	 	    			  temp--;
	 	    			  
	 	    		  }
	 	    	  }
	    	   }
	    	   
	    	   if(myBool == false) {
	    		   System.out.println(S.charAt(i));
	    		   return S.charAt(i);
	    		   
	    	   }
	    	   
	    	  
	       }
	       
	       System.out.println('d');
	       return 'd';
	    }

}
