package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List <String> fruits = new LinkedList<>();
		List <String> vegetables = new ArrayList<>();
       fruits.add("apple");
       fruits.add("sharad");
       fruits.add("anuj");
       
       String temp[] = new String[fruits.size()];
       fruits.toArray(temp);
       for(String e: temp) {
    	   System.out.println(e);
       }
//       List<String> toRemove = new ArrayList();
//       toRemove.add("apple");
//       toRemove.add("sharad");
//       		fruits.removeAll(toRemove);
       
//       System.out.println(fruits.size());
//       System.out.println(fruits.contains("sharad"));
//       System.out.println(fruits.isEmpty());
//       System.out.println(fruits.toArray());
       		
//       fruits.set(1, "banana");
//       fruits.remove(2);
       		
       		
//       fruits.clear();
    		   
       
//       vegetables.add("potato");
//       vegetables.add("ladyfinger");
//       
//       fruits.addAll(vegetables);
       
//       System.out.println(fruits.get(1));
           System.out.println(fruits);
//       
//       ArrayList<Integer> marks = new ArrayList();
//		
//		Double x = 23.0;
//		Pair<String, Integer> p1 = new Pair("Sharad", 23);
//		Pair<Boolean, String> p2 = new Pair(true, "tripathi");
//		
//		p1.getDescription();
//		p2.getDescription();
       
       
	}

}
