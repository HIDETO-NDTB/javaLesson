package practice_programs;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		for(int i=1;i<=num; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers of "+num+" = "+ sum);
	}

}
