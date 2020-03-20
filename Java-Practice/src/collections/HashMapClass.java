package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> obj = new HashMap<Integer,String>();
		
		obj.put(1,  "Rahul");
		obj.put(2,  "Kishore");
		obj.put(3,  "Singh");
		obj.put(4,  "Ajeet");
		obj.put(5,  "Anuj");
		
		//Display elements using Integer Interface
		Set set = obj.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is: "+mentry.getKey()+" & Value is: ");
			System.out.println(mentry.getValue());
		}
		
		//Get values based on key
		String var = obj.get(2);
		System.out.println("Value at index 2 is : "+var);
		
		//Remove element based on key
		obj.remove(3);
		System.out.println("Map Key and values after removal :");
		
		//Display elements using Integer Interface
		Set set1 = obj.entrySet();
		Iterator iterator1 = set.iterator();
		while(iterator1.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator1.next();
			System.out.print("key is: "+mentry.getKey()+" & Value is: ");
			System.out.println(mentry.getValue());
		}
		
		//check if key exists in hashmap
		boolean flag = obj.containsKey(7);
		System.out.println("Key 7 in HashMap? :"+flag);
		
		//check if value exists in hashmap
		boolean flag1 = obj.containsValue("Ajeet");
		System.out.println("String Ajeet in HashMap? :"+flag1);
				
	}

}
