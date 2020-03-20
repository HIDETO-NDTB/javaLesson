package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> obj = new LinkedHashSet<String>();
		
		obj.add("Z");
		obj.add("PQ");
		obj.add("N");
		obj.add("KK");
		obj.add("FGH");
		obj.add("KK");
		obj.add("FGH");
		
		System.out.println(obj);
		
		LinkedHashSet<Integer> obj1 = new LinkedHashSet<Integer>();
		
		obj1.add(5);
		obj1.add(45);
		obj1.add(23);
		obj1.add(89);
		obj1.add(108);
		obj1.add(89);
		obj1.add(108);
		
		System.out.println(obj1);

	}

}
