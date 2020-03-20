package collections;

import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> obj = new LinkedList<String>();
		obj.add("Product1");
		obj.add("Product2");
		obj.add("Product3");
		obj.add("Product4");
		obj.add("Product5");
		
		System.out.println("Linked List Contents: "+obj);
		
		obj.addFirst("First Product");
		obj.addLast("Last Product");
		
		System.out.println("Linked List Added: "+obj);
		
		obj.set(0, "Updated element");
		
		System.out.println("Linked List Updated: "+obj);
		
		obj.removeFirst();
		obj.removeLast();
		
		System.out.println("Linked List After Remove: "+obj);
		
		obj.add(0,"New Product");
		obj.remove(2);
		
		System.out.println("Final Linked List: "+obj);
	}

}
