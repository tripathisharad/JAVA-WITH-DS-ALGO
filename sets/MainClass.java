package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
//		Set<String> fruits = new HashSet<>();
//		Set<String> fruits = new LinkedHashSet<>();
//		Set<String> fruits = new TreeSet<>();
//		
//		
//		fruits.add("Xray");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		fruits.add("Banana");
//		
//                	System.out.println(fruits);
		
		
		
		
		Set<Integer> x = new HashSet<>();
		x.add(12);
		x.add(34);
		x.add(67);
		x.add(50);
		
		Set<Integer> y = new HashSet<>();
//		y.add(122);
//		y.add(60);
		y.add(50);
		
//		x.addAll(y);
		x.retainAll(y);
		
		System.out.println(x.containsAll(y));
		System.out.println(x);
		
		
	
	}

}
