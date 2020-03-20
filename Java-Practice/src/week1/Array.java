package week1;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//Array Declaration
		int array[] = new int[3];
		
		//Array Initialization
//		array[0] =10;
//		array[1] =20;
//		array[2] =30;
//		array[3] =40;
//		array[4] =50;
//		array[5] =60;
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter value "+(i+1));
			array[i] = sc.nextInt();
		}
		
		for(int i = 0;i < array.length; i++) {
		    System.out.print(array[i]+" ");
		}
		
		System.out.println();
		//exchange for loop
		for(int num:array) {
			System.out.print(num+" ");
		}
		
		System.out.println();
		//Array declaration and initialization in single statement
		int array1[] = {2,5,6,3,5,2};
		
		for(int i=0; i < array1.length; i++) {
		System.out.print(array1[i]+" ");
	    }
		
		System.out.println();
		//Array Index out of Bounds Exception
		int arr[] = {50,60,70,80 };
		for(int i=0;i< arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		//passing arrays to function
		int a[] = {33, 3, 47, 8};
		min(a);
		
		//Returning arrays from function
		int arr1[] = get();
		
		for(int i=0;i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
		//Multidimensional Array
		//Declaration Syntax
		int[][] arrayRefVar;
		int [][]arrayRefVar1;
		int arrayRefVar2[][];
		int [] arrayRefVar3;
		
		//Array Declaration
		int adArray[][] = new int[10][20];
		int[][] intArray = new int[10][20]; //2D Array
 		int[][][] intArray1 = new int[10][20][30]; //3D Array
 		
 		//Initialize 2D Array
 		int[][] arrayd1 = {
 				{1,2,3},
 				{4,5,6,9},
 				{7}
 		};
 		
 		System.out.println("Length of rows1 "+arrayd1[0].length);
 		System.out.println("Length of rows2 "+arrayd1[1].length);
 		System.out.println("Length of rows3 "+arrayd1[2].length);
 		
 		//print the element of 2D array using nested for loop
 		for(int i=0;i<arrayd1.length;++i) {
 			for(int j=0;j<arrayd1[i].length; ++j) {
 				System.out.print(arrayd1[i][j]+" ");
 			}
 		}
 		
 		System.out.println();
 		
 		//enhanced for loop to print 2D array
 		for(int[] innerArray: arrayd1) {
 			for(int data: innerArray) {
 				System.out.print(data+" ");
 			}
 		}
 		System.out.println();
 		
 		//3D array
 		int[][][]test = {
 				{
 					{1,2,3},
 					{4,5,6},
 				},
 				{
 					{-4,-5,6,9},
 					{1},
 					{2,3}
 				}
 		};
 		
 		//print 3D array using enhanced for loop
 		for(int[][] array2D : test) {
 			for(int[] innerArray: array2D) {
 				for(int data:innerArray) {
 					System.out.print(data+" ");
 				}
 			}
 		}
 		System.out.println();
 		
 		//print 2D array in matrix format
 		for(int[] row: arrayd1) {
 			System.out.println(Arrays.toString(row));
 		}
 		System.out.println();
 		
 		//print 3D array in matrix format
 		for(int[][] row: test) {
 			System.out.println(Arrays.deepToString(row));
 		}
 		
		
	}
	
	static int[] get() {
		return new int[] {10,20,30,50};
	}
	
	public static void min(int arr[]) {
		int min = arr[0];
		for(int i = 1; i< arr.length; i++) {
			if(min > arr[1]) {
				min = arr[i];
			}
		}
		System.out.println("Minimum value: "+min);
	}

}
