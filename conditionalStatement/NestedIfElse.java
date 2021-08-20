package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {

		
		int a = 15, b = 99, c = 100;
		int result = 0;
		
		if(a>b) {		
		   if(a>c) {
			
			result = a;
		   }else {
			   result = c;
			     
		   }
		}else {
			if(b>c)	{
				result = b;
				
		}else {
		        result = c;
				
			}
	    }
		System.out.println("Largest of the three no. is " + result);
		
		//Second Method for if else 
//		result = a>b ? a>c ? a:c : b>c ? b:c; 
		System.out.println("The largest of the three no. is " + result);
		   		
	 }

	}
