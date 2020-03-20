package exception_handling;

import java.util.Scanner;

public class Exception_Need {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the length of the array");
		int length = sc.nextInt();
		
		int array[] = new int[length];
		
		try {
		System.out.println("Enter "+length+" elements");
		for(int i=0;i<length;i++) {
		    array[i] = sc.nextInt();
		}
		
		print(array);
		} catch(Exception e) {
			System.out.println("Array can store only upto 3 elements "+e);
		}finally {
			sc.close();
			System.out.println("Finally is always printed");
		}
		
		System.out.println("Fourth Line");
		System.out.println("Fifth Line");
	}
	
	private static void print(int[] array) {
		System.out.println(array[3]);
		System.out.println("Fourth element successfully displayed");
	}

}
