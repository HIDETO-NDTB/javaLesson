package collections;

import java.util.HashSet;

public class HashSetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> obj = new HashSet<String>();
		
		obj.add("Apple");
		obj.add("JackFruit");
		obj.add("Rasberry");
		obj.add("WaterMelon");
		
		//Add duplicate elements
		obj.add("Apple");
		obj.add("WaterMelon");
		
		//Add Null values
		obj.add(null);
		obj.add(null);
		
		System.out.println(obj);
		
	}

}
