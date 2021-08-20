package comparableAndComparaters;
import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student (23, "Ram"));   
		students.add(new Student (730, "Sharad"));
		students.add(new Student (89, "Shivam"));
		students.add(new Student (93, "Ashutosh"));
		students.add(new Student (56, "AkashMadhur"));
		
		Collections.sort(students);
		
		
		students.forEach(System.out::println);

		
	}

}

class SortByNameThenClass implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.name.equals(o2.name)) {
		return o1.marks - o2.marks;
		
	}
		return 0; } 
}