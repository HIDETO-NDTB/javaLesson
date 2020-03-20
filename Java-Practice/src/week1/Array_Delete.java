package week1;

import java.util.Scanner;

public class Array_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int length,position,element,count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		length = sc.nextInt();
		
		int arr[] = new int[length+1];
		
		System.out.println("Enter "+length+" elements");
		for(int i=0;i<length;i++) {
			arr[i] = sc.nextInt();
		}
		
 		System.out.println("Enter the element which you want to delete : ");
 		element = sc.nextInt();
 		
 		for(int i=0;i<length;i++) {
 			if(arr[i] == element) {
 				for(int j=i; j<(length-1);j++) {
 					arr[j] = arr[j+1];
 				}
 				count++;
 				break;
 			}
 		}
 		
 		if(count == 0) {
 			System.out.println("Element not Found");
 		}else {
 			System.out.println("Element deleted sunccessfully");
 			System.out.println("After Deleting");
 	 		for(int i=0;i<length-1;i++) {
 	 			System.out.println("arr["+i+"] = "+ arr[i]);
 	 		}
 		}
 		
 		
 		sc.close();
	}
	

}
