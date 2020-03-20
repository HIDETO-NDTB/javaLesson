package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> obj = new TreeMap<Integer,String>();
		
		obj.put(10, "Carrot");
		obj.put(5, "Beans");
		obj.put(25, "Onion");
		obj.put(15, "Drumstick");
		obj.put(30, "Tomato");
		
		//Display elements using Integer Interface
		Set set = obj.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: "+mentry.getKey()+" & Value is: ");
			System.out.println(mentry.getValue());
		}
		System.out.println("Size of TreeMap is: "+obj.size());
		
	}

}
