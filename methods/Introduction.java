package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 23;
		int secondNumber = 45;
		int result = maxOf(firstNumber, secondNumber);
		System.out.println(result);
		
//		maxOf(200,100);
//		maxOf(34,35);
//		sayHi();
		
		maxOf(5);
		
	}

  static int maxOf(int a, int b) {
		   if(a>b) {
			   return a;
			   
		   }else {
			   return b;
		   }
	}
     
     static void maxOf(float d) {
    	 
     }
   static void sayHi() {
	   System.out.println("Hi");
	   System.out.println("Good Morning");
   }
}
