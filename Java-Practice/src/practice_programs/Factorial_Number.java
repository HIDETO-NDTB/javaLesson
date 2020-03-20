package practice_programs;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		long fact = 1;
		
		int i = 1;
		while(i <= num) {
			fact = fact * i;
			i++;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
	}

}
