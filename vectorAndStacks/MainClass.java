package vectorAndStacks;

//import java.util.Stack;

//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {
		
//		Vector<Integer> v = new Vector();
//		v.add(24);
//		v.add(90);
		
		MyStack<Integer> stack = new MyStack();
		
		stack.push(23);
		stack.push(76);
		stack.push(900);
		
		int popped = stack.pop();
		popped = stack.pop();
		System.out.println(popped);
		popped = stack.pop();
		System.out.println(popped);
		
		
	
	}

}
