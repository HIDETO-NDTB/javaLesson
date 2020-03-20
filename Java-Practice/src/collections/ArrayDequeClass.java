package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> obj = new ArrayDeque<String>();
		
		obj.add("Gleen");
		obj.add("Negan");
		obj.add("Maggle");
		obj.add("Rick");
		obj.add("John");
		
		obj.push("sa");
        obj.push("mu");
		
		System.out.println("Elements in Deque: "+obj);
		
		System.out.println("remove elements: "+obj.removeLast());
		System.out.println("Elements in Deque: "+obj);
		
		System.out.println("Head: "+obj.element());
		System.out.println("Head: "+obj);
		System.out.println("Poll: "+obj.pollLast());
		System.out.println("Head: "+obj);
		System.out.println("Peek: "+obj.peek());
		
		System.out.println("Elements in Deque: "+obj);
	}

}
