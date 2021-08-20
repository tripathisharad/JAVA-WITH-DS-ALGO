package maps;
import java.util.*;
//import java.util.HashMap;
import java.util.Map.Entry;
public class MainClass {

	public static void main(String[] args) {
		
//		Map<String, Integer> numbers = new HashMap<>();
//
//		numbers.put("Madhur", 50);
//		numbers.put("Sharad", 1000);
//		numbers.put("Shivam", 100);
//		
//		
//		numbers.put("Sharad", 2000);
//		numbers.putIfAbsent("Sharad", 100);
//		numbers.remove("Shivam", 100);
//		
//		
////		System.out.println(numbers );
//		System.out.println(numbers.get("Shivam"));
//		System.out.println(numbers.get("Hemant"));
//		System.out.println(numbers.containsValue(2000));
//		System.out.println(numbers.keySet());
//		System.out.println(numbers.values());
//		System.out.println(numbers.entrySet()); 
//		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
//		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//			
//			System.out.println(numbers);
//		}
		
		System.out.println(getHash("CAT"));
		System.out.println(getHash("GOD"));
		System.out.println(getHash("ELEPHANT"));
		System.out.println(getHash("SHARAD"));
	}
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
