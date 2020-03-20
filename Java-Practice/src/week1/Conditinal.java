package week1;

import java.util.Scanner;

public class Conditinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		//if statement
		if(num <= 100) {
			System.out.println("Value of num is: "+num);
		}
		
		//if-else statement
		if(num <= 100) {
			System.out.println("Value is greater than: "+num);
		}else {
			System.out.println("Value is less than: "+num);
		}
		
		//nested-if statement
				if(num <= 100) {
					System.out.println("Value is less than 100");
				    if(num > 50) {
					    System.out.println("Value is greater than 50");
				    }
				}
		
		//if-else-if statement
		int marks;
		char grade;
		
		System.out.println("Enter the marks:");
		marks = sc.nextInt();
	    
		if(marks >= 80) {
			grade = 'A';
		}else if(marks >= 70) {
			grade = 'B';
		}else if(marks >= 60) {
			grade = 'C';
		}else if(marks >= 50) {
			grade = 'D';
		}else {
			grade ='F';
		}
		System.out.println("Grade = "+grade);
		
		//Switch-case Statement
		System.out.println("Enter the value:");
		int value = sc.nextInt();
		
		switch(value) {
		case 100:
			System.out.println("Value: "+value);
			break;
		case 500:
			System.out.println("Value: "+value);
			break;
		case 1000:
			System.out.println("Value: "+value);
			break;
		default:
			System.out.println("Default: "+value);
		}
		
		System.out.println("Enter the character:");
		char character = sc.next().charAt(0);
		
		switch(character) {
		case 'S':
			System.out.println(character);
			break;
		case 'O':
			System.out.println(character);
			break;
		case 'N':
			System.out.println(character);
			break;
		default:
			System.out.println("Character Not matching:");
		}
		
	}

}
