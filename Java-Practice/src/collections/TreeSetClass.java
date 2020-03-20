package collections;

import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> obj = new TreeSet<String>();
		
		obj.add("ABC");
		obj.add("Test");
		obj.add("Pen");
		obj.add("ink");
		obj.add("Jack");
		
		System.out.println(obj);
		
        TreeSet<Integer> obj1 = new TreeSet<Integer>();
		
		obj1.add(30);
		obj1.add(50);
		obj1.add(10);
		obj1.add(70);
		obj1.add(40);
		obj1.add(70);
		obj1.add(40);
		
		System.out.println(obj1);
	}

}
