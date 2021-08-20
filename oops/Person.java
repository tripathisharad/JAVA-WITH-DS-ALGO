package oops;

import oops.A.B;
import oops.A.C;

public class Person {
	
	 static {
		 System.out.println("in block 1");
	 }
	 
	 static {
		 System.out.println("in block 2");
	 }

	public static void main(String[] args) {
		
		
		System.out.println("inside main");
	
//		System.out.println(Math.PI);
		
//		System.out.println(Math.max(27,15));  
		
		
//		System.out.println(Math.log(4));
		
		
//		System.out.println(Math.floor(3.45));
		
		
		A objA = new A();
		B objB = objA.new B();
		
		
		C objc = new A.C();
		

	}

}
