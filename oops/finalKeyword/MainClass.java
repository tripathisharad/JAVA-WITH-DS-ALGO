package oops.finalKeyword;

public class MainClass extends StudentClass {

//(here once you made your function final then it can not be overrite like below you will gett compile time erro)
//	public void getDescription() {
//		System.out.println("inside the class");
//	}
	
	
	
//	final int;(you must have to initialize just like below)
	
//	final int ROLL_NO = 4;
	public static void main(String[] args) {
		
//	  final	String name = "Sharad";
//		  System.out.println(name);

//		final StudentClass obj = new StudentClass();
//		StudentClass obj2 = new StudentClass();
//		
//	    obj.name = "Sharad";
		
		MainClass obj = new MainClass();
		obj.getDescription();
	}

}
