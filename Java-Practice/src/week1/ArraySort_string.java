package week1;

import java.util.Scanner;

public class ArraySort_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int count;
        String temp,str[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of strings");
		count = sc.nextInt();
		
		str = new String[count];
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("Enter"+count+" strings");
		for(int i=0;i<count;i++) {
			str[i] = sc2.nextLine();
		}
		
		for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
		System.out.println();
        System.out.println("Array elements in Alphabetical[A-Z] order");
        for(int i=0;i<count; i++) {
        	System.out.println(str[i]+" ");
        }
        
        for(int i=0;i<count;i++) {
			for(int j=i+1;j<count;j++) {
				if(str[i].compareTo(str[j]) < 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		
        System.out.println("Array elements in Alphabetical[Z-A] order");
        for(int i=0;i<count; i++) {
        	System.out.println(str[i]+" ");
        }
	}

}
