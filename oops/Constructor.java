package oops;
class Vehicle {
	
	int Wheels;
	 
//	Vehicle() {
//		
//		Wheels = 4;
//	}
	
	int headLight;
	String colour;
	
//	Vehicle(int noofWheels) {
//		
//		Wheels = noofWheels;
//		headLight = 2;
//	}
	
	
Vehicle(int Wheels) {
		
		this.Wheels = Wheels;
		headLight = 2;
	}

     Vehicle(int Wheels, String colour) {
    	 this.Wheels = Wheels;
    	 this.colour = colour;
    	 headLight = 2;
    	 
     }

public class Constructor {
	
 Constructor() {
		 System.out.println("Object is now created");
		 
	 }
 

	public  void main(String[] args) {
		
//	     Constructor obj = new Constructor();
		
		Vehicle car = new Vehicle(4);
		Vehicle Scooty = new Vehicle(2);
		
		Vehicle erikshaw = new Vehicle(3, "Yellow");
		
		
//		System.out.println(car.Wheels + " Wheels");
	     System.out.println(erikshaw.Wheels + " Wheels and colour" + erikshaw.colour);
	     
	}
  }
}
