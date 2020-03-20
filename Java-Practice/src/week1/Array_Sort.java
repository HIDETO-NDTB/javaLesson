package week1;

import java.util.Scanner;

public class Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int count,num[],item, temp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements");
		count = sc.nextInt();
		
		num = new int[count];
		
		System.out.println("Enter"+count+"integers");
		for(int i=0;i<count;i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
        System.out.println("Array element in numerical order");
        for(int i=0;i<count; i++) {
        	System.out.println(num[i]+" ");
        }
        
		
		System.out.println();
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(num[i] < num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
        System.out.println("Array element in numerical order");
        for(int i=0;i<count; i++) {
        	System.out.println(num[i]+" ");
        }
        
	}

}
