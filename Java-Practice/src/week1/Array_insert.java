package week1;


import java.util.Scanner;

public class Array_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length,position,element;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		length = sc.nextInt();
		
		int arr[] = new int[length+1];
		
		System.out.println("Enter "+length+" elements");
		for(int i=0;i<length;i++) {
			arr[i] = sc.nextInt();
		}
		
 		System.out.println("Enter the position where you want to insert : ");
 		position = sc.nextInt();
 		
 		System.out.println("Enter the new element  : ");
 		element = sc.nextInt();
 		
 		//Array Insertion
 		
 		for(int i=length-1; i>=(position -1); i--) {
 			arr[i+1] = arr[i];
 		}
 		arr[position-1] = element;
 		
 		System.out.println("After Inserting");
 		for(int i=0;i<length;i++) {
 			System.out.println("arr["+i+"] = "+ arr[i]);
 		}
 		System.out.println("arr["+length+"] = "+ arr[length]);
	}

}
