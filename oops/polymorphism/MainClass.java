package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;
		
		System.out.println(d.name);
		System.out.println(p.name);
//		Animal a = d;
//		
//		d.Walk();
//		p.Walk();

		
//		(compile type polymorphism)
		
//		greetings("Good morning", 5);
//		
	}
	
	public static void greetings() {
		    System.out.println("Hi, there");
	}
	public static  void greetings(String s) {
		System.out.println(s);
	}

	 public static void greetings(String s, int count) {
		 for(int i = 0; i<count; i++) {
			 System.out.println(s);
		 }
	 }
}
