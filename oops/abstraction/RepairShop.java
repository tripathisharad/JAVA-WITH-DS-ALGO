package oops.abstraction;

public class RepairShop {

	public static void repaircar(Car car) {
		System.out.println("Car is repaired");
	}
	
	public static void main(String[] args) {
		
		Wagnor wagnor = new Wagnor();
		Audi audi = new Audi();
		
		repaircar(wagnor);
		repaircar(audi);
	}

}
