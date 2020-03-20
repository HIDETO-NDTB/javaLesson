package week1;

import java.util.Scanner;

public class homework_ex3 {
	
	public static void numCheck(int num) {
		if(num > 0) {
			System.out.println("Number is positive");
		} else if(num == 0){
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is negative");
		}
	}
	
	public static void evenCheck(int num2) {
		if(num2 % 2 == 0) {
			System.out.println('1');
		} else {
			System.out.println('0');
		}
	}
	
	public static void dayCheck(int month,int year) {
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			System.out.println(month+" "+year+" has 31 days");
		} else if(month == 4|| month == 6 || month == 9 || month == 11) {
			System.out.println(month+" "+year+" has 30 days");
		} else if(month == 2 && year % 4 == 0) {
			System.out.println(month+" "+year+" has 29 days");
		} else {
			System.out.println(month+" "+year+" has 28 days");
		}
	}
	
	public static void leapCheck(int years) {
		if(years % 400 == 0) {
			System.out.println(years+" is a leap year");
		} else if(years % 100 == 0) {
			System.out.println(years+" is not a leap year");
		} else if(years % 4 == 0) {
			System.out.println(years+" is a leap year");
		} else {
			System.out.println(years+" is not a leap year");
		}
	}
	
	public static void calcCube(int length) {
		for(int i=1; i<=length; i++) {
			System.out.println("Number is: "+i+" and cube of "+i+" is: "+(i*i*i));
		}
	}
	
	public static void angle(int height) {
		for(int j=1; j<=height; j++) {
			for(int k=1; k<=j; k++) 
				System.out.print(k);	
				System.out.println();
			}	
		}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1.Write a Java program that reads an integer and check whether it is negative, zero, or positive.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = sc.nextInt();
		numCheck(num);
		System.out.println();
		
		System.out.println("2.Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. ");
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num2 = sc2.nextInt();
		evenCheck(num2);
		System.out.println();
		
		System.out.println("3.Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.");
		for(int a=1;a<100;a++) {
			if(a%2==0) {
				continue;
			}else {
				System.out.println(a);
			}
		}
		System.out.println();
		
		System.out.println("4.Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.");
		System.out.println("Divided by 3:");
		for(int b=0;b<=100;b++) {
			if(b%3!=0) {
				continue;
			} else {		
				System.out.print(b+" ");
			}
		}
		System.out.println();
		System.out.println("Divided by 5:");
		for(int c=0;c<=100;c++) {
			if(c%5!=0) {
				continue;
			} else {		
				System.out.print(c+" ");
			}
		}
		System.out.println();
		System.out.println("Divided by 3 & 5:");
		for(int d=0;d<=100;d++) {
			if(d%15!=0) {
				continue;
			} else {		
				System.out.print(d+" ");
			}
		}
		System.out.println();
		
		System.out.println("5.Take three numbers from the user and print the greatest number.");
		Scanner sc3 = new Scanner(System.in);
      System.out.print("Input the 1st number: ");
      int e = sc3.nextInt();
      System.out.print("Input the 2nd number: ");
      int f = sc3.nextInt();
      int maxNum;
      if(e > f) {
       maxNum = e;
      } else {
       maxNum = f;
      }
      System.out.print("Input the 3rd number: ");
      int g = sc3.nextInt();
      if(g > maxNum) {
       maxNum = g;
      }
      System.out.println("The greatest: "+maxNum);
      System.out.println();
		
		System.out.println("6.Write a Java program to find the number of days in a month.");
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Input a month number: ");
		int month = sc4.nextInt();
		System.out.print("Input a month number: ");
		int year = sc4.nextInt();
		dayCheck(month,year);
		System.out.println();
		
		System.out.println("7.Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.");
		boolean checkVowel = false;
		Scanner sc5 = new Scanner(System.in);
		System.out.print("Input an alphabet: ");
		char h = sc5.next().charAt(0);
		switch(h) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': checkVowel = true;
		}
		
		if(checkVowel == true) {
			System.out.println("Input letter is Vowel");
		} else if(h >= 'a' && h <= 'z' || h >= 'A' && h <= 'Z') {
			System.out.println("Input letter is Consonant");
		} else {
			System.out.println("Input letter is not character");
		}
		System.out.println();
		
		
		System.out.println("8.Write a Java program that takes a year from user and print whether that year is a leap year or not. ");
		Scanner sc6 = new Scanner(System.in);
		System.out.print("Input the year: ");
		int years = sc6.nextInt();
		leapCheck(years);
		System.out.println();
		
		System.out.println("9.Write a program in Java to display the cube of the number upto given an integer.");
		Scanner sc7 = new Scanner(System.in);
		System.out.print("Input number of terms: ");
		int length = sc7.nextInt();
		calcCube(length);
		System.out.println();
		
		System.out.println("10.Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row. The pattern is as follows:");
		Scanner sc8 = new Scanner(System.in);
		System.out.print("Input number: ");
		int height = sc8.nextInt();
		angle(height);
		
	}

}
