package practice_programs;

import java.util.Scanner;

public class Fibonacchi_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0, num2 = 1,sumofprev = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limite: ");
		int count = sc.nextInt();
		
		for(int i=1; i<=count; i++) {
			
			System.out.print(num1+" ");
			
			sumofprev = num1 + num2;
			num1 = num2;
			num2 = sumofprev;
			
		}
	
	    int i =1;
	    while(i<=count) {
	    	System.out.print(num1+" ");
	    	
	    	sumofprev = num1 + num2;
			num1 = num2;
			num2 = sumofprev;
	    	
	    	i++;
	}
	}

}
