package collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> obj = new Vector<String>(2);
		
		obj.addElement("Apple");
		obj.addElement("Orange");
		obj.addElement("Mango");
		obj.addElement("Grapes");
		obj.addElement("Kiwi");
		
		System.out.println("Size is: "+obj.size());
		System.out.println("Default Capacity is: "+obj.capacity());
		
		obj.addElement("Fruit1");
		obj.addElement("Fruit2");
		obj.addElement("Kiwi");
		obj.addElement("Banana");
		obj.addElement("Kiwi");
		
		System.out.println("Size after addition: "+obj.size());
		System.out.println("Capacity after increment  is: "+obj.capacity());
		
		Enumeration<String> en = obj.elements();
		System.out.println("Elements are :");
		while(en.hasMoreElements()) {
			System.out.print(en.nextElement()+" ");
		}
		System.out.println();
		
		int first_index = obj.indexOf("Kiwi");
		System.out.println("First Occurance of Kiwi at index: "+first_index);
		
		int last_index = obj.lastIndexOf("Kiwi");
		System.out.println("First Occurance of Kiwi at index: "+last_index);
		
		int after_index = obj.indexOf("Kiwi",6);
		System.out.println("After Occurance of Kiwi at index: "+after_index);
		
		int before_index = obj.lastIndexOf("Kiwi",5);
		System.out.println("Before Occurance of Kiwi at index: "+before_index);
		
		
	}

}
