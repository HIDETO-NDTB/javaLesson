package collections;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Pomogranite");
		obj.add("Banana");
		obj.add("Grapes");
		
		System.out.println("Original ArrayList");
		for(String str:obj) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		obj.add(0,"Watermelon");
		obj.add(2,"Muskmelon");
		
		System.out.println("Updated ArrayList");
		for(String str:obj) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		obj.remove("Muskmelon");
		obj.remove("Grapes");
		
		System.out.println("After Remove ArrayList");
		for(String str:obj) {
			System.out.print(str+" ");
		}
		System.out.println();
		
		obj.remove(0);
		obj.remove(0);
		
		System.out.println("Final ArrayList");
		for(String str:obj) {
			System.out.print(str+" ");
		}
		System.out.println();
		
	}

}
