package week1;

import java.util.Scanner;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//for-loop
		for(int i=10;i>=1;i--) {
			System.out.println("The value of i is :"+i);
		}
		
		//Enhanced For-loop
		String arr[] = {"hi","hello","bye"};
		for(String str: arr) {
			System.out.println(str);
		}
		
		int num[] = {2,11,15,9};
		for(int i=0; i<num.length ;i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		for(int i:num) {
			System.out.println(i);
		}
		
		String colors[] = {"red","green","blue"};
		
		for(String str: colors) {
			System.out.print(str+" ");
		}
		
		//Nested For loop
		int num_arr[] = {1,2,3,4,5};
		for(int i=0;i< num_arr.length;i++) {
			for(int j=0; j < i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		//While loop
		int i = 1;
		while(i < 10) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		//Iterating an array using while loop
		int array[] = {2,14,11,25,6};
		int k=0;
		while(k<array.length) {
			System.out.println(array[k]);
			k++;
		}
		
		//Do-while loop
		int s=5;
		do {
			System.out.println("The value of s:"+s);
			s--;
		}while(s>6);
		
		//Iterating an array using the do-while loop
		int arr1[] = {5,4,6,2};
		int index = 0;
		do {
			System.out.println(arr1[index]);
			index++;
		}while (index < arr1.length);
		
		//do-while Ex:2
		int n1,n2;
		char choice;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the first number");
			n1 = sc.nextInt();
			
			System.out.println("Enter the second number");
			n2 = sc.nextInt();
			
			System.out.println("Do you want to continue y/n?");
			choice = sc.next().charAt(0);
			
			if(choice != 'y' && choice != 'Y') {
				System.out.println("Thank you!");
			}
			System.out.println();
		}while(choice == 'y' || choice == 'Y');
			
	}

}
