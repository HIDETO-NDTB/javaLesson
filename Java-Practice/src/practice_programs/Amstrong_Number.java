package practice_programs;

import java.util.Scanner;

public class Amstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,digit1,digit2,digit3;
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer: ");
        num = sc.nextInt();
        
        for(int i=1; i <= num; i++) {
        	int temp = i;
        	digit1 = temp % 10;
        	
        	temp = temp / 10;
        	digit2 = temp % 10;
        	
        	temp = temp / 10;
        	digit3 = temp % 10;
        	
        	if((digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3) == i){
        		System.out.println("Armstrong number from 1 to "+num+" "+i);
        	}
        }
	}

}
