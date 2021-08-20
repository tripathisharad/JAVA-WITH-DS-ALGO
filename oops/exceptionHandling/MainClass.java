package oops.exceptionHandling;

import operators.ArithmaticOperator;

public class MainClass {

	public static void main(String[] args) {
//		try {
//		int a = 4;
//		int b = 0;
//	    int c = a/b;
//		int a[] = new int[5];
		
//	 System.out.println(a[4]);
//		}catch(ArithmeticException e) {
//System.out.println(e.getMessage() + " occured, please check your code");
//		}catch(ArrayIndexOutOfBoundsException e) {
//System.out.println("index should be in the range of size of array");
//		}catch(IllegalArgumentException e) {
//System.out.println("check your casting carefully");
//		}finally {
//			System.out.println("sorry for the inconvience ");
//		}
//		
//		
//		System.out.println("very important code");
//		System.out.println("needs to run");
		
		fun1();
	}

	static void fun1() {
		int a = 4;
		int b = 5;
	    int c = a/b;
	 System.out.println(c);
	 try {
	 fun2(); 
	 }catch(Exception e) {
		 System.out.println(e.getMessage() + " occured");
	 }
//	 boolean isDanger = true;
//	 if(isDanger) {
//		 throw new ArrayIndexOutOfBoundsException("danger was coming");
//	  }
	}
	static void fun2() throws ArrayIndexOutOfBoundsException {
		 boolean isDanger = true;
		 if(isDanger) {
 throw new ArrayIndexOutOfBoundsException("danger was coming");
		  }
		
	}
}
