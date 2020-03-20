package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String> obj = new LinkedList<String>();
		
		obj.add("Jack");
		obj.add("Joe");
		obj.add("Micheal");
		obj.add("Raggle");
		obj.add("Megan"); 
		
		
		System.out.println("Elements in Queue: "+obj);
		
		System.out.println("Removed Element: "+obj.remove());
		
		System.out.println("Head: "+obj.element());
		System.out.println("Poll: "+obj.poll());
		System.out.println("Peek: "+obj.peek());
		
		System.out.println("Elements in Deque: "+obj);
		
		
	}

}
