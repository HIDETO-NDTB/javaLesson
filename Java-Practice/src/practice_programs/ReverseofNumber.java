package practice_programs;

import java.util.Scanner;

public class ReverseofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int reverse_num = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your number");
		num = sc.nextInt();
		
		//Method1
		if(num >= 10) {
		    while(num != 0) {
				reverse_num = reverse_num * 10;
				reverse_num = reverse_num + num % 10;
				num = num/10;
		    }
		    System.out.println("Reverse of Number: "+reverse_num);
		} else {
			System.out.println("Number should be greater than or equal to 10");
		}
		
		//Method2
		reverseNum(num);
		
		//Method 3
		for( ;num != 0 ;) {
			reverse_num = reverse_num * 10;
			reverse_num = reverse_num + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of the number: "+reverse_num);
		
	}

	private static void reverseNum(int number) {
		// TODO Auto-generated method stub
		if(number < 10) {
			System.out.println(number);
			return;
		}else {
			System.out.print("Reverse of Number "+number % 10);
			reverseNum(number/10);
		}
	}

}
