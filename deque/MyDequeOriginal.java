package deque;

public class MyDequeOriginal<S> {

	Node<S> head, tail;
	
	public void toAddFirst(S data) {
		
		Node<S> toAdd = new Node<S>(data);
		
		
		
		if(head == null) {
			head = tail = toAdd;
		}
		
		head.next = toAdd;
		toAdd.prev = head;
		head = head.next;
	}
	
	public S removeLast() {
		  
		Node<S> toremove = tail;
		
		tail = tail.next;
		tail.prev = null;
		
		if(tail == null) {
			head = null;
		}
		
		return toremove.data;
		
		
	}
	
	public void getFirst() {
		
		System.out.println(head.data);
	}
	
	
	
	public static class Node<S>{
		
		S data;
		Node<S> next, prev;
		
		public Node(S data) {
			this.data = data;
			this.next = this.prev = null;
		}
		
	}
	
}
