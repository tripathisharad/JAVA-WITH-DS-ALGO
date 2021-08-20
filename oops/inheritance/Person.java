package oops.inheritance;

public class Person {

	 protected String name;
	 
	 public Person(String name) {
		 this.name = name;
		 System.out.println("inside person constructor");
	 }
	 
	 public void Walk() {
//		 System.out.println("Person is walking");
		 
		 System.out.println("Person " +name +" is walking");
	 }
	
	 public void eat() {
//		 System.out.println("Person is eating");
		 
		 System.out.println("Person " +name +" is eating");
	 }
	 
	 public static void laughing() {
		 System.out.println("person is laughing");
	 }
}
