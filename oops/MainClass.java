package oops;
class Cat {
	boolean hasFur;
	String colour,breed;
	int legs, eyes;
	
	
	public void walk() {
		System.out.println("cat is walking");
	}
	
	public void eat() {
		System.out.println("cat is eating");
	}
	
	public void description() {
		System.out.println("my cat has " + legs + " legs and " + eyes + " eyes");
	}
}


class Dog {

String breed, name;

public void jump() {
	System.out.println("my dog " + name + " jumped");
}

public void description() {
	System.out.println("my dog is " + name + " and its breed " + breed);
	
   }
}


public class MainClass {

	public static void main(String[] args) {
		
        
//		Cat cat1 = new Cat();
//		Cat cat2 = new Cat();
//		
//		cat1.legs = 4;
//		cat1.eyes = 2;
//		cat2.legs = 3;
//		
//		cat1.walk();
//		cat2.eat();
//		cat1.description();
//		cat2.description();
		
		Dog husky = new Dog();
		Dog poodle = new Dog();
		
		husky.breed = "Husky";
		husky.name = "James";
	    poodle.breed = "Browny";
	    poodle.name = "Major";
	    
	    
	    husky.jump();
	    husky.description();
	    
	    poodle.jump();
	    poodle.description();
		
		
		
		
		
	}

}
