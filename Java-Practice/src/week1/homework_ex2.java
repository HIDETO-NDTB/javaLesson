package week1;

import java.util.Scanner;

public class homework_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("EXERCISE 2");
		System.out.println("1.Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.");
		
		int a = 125;
		int b = 24;
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		System.out.println(a+"mod"+b+"="+(a%b));
		System.out.println();
		
		System.out.println("2.Write a Java program that takes a number as input and prints its multiplication table upto 10.");
		int c = 8;
		for(int i=0;i<=10;i++) {
		System.out.println(c+"*"+i+"="+(c*i));
		}
		System.out.println();
		
		System.out.println("3.Write a Java program to swap two variables. Also try to swap without using third variable.");
		int d = 0;
		int e = 1;
		int temp;
		System.out.println("d= "+d+",e="+e);
		temp = d;
		d = e;
		e = temp;
		System.out.println("d= "+d+",e="+e);
		System.out.println();
		
		System.out.println("4.Write a Java program to convert temperature from Fahrenheit to Celsius degree.");
		float fahrenheit = 212.0f;
		float Celsius = fahrenheit - 112.0f;
		System.out.println(fahrenheit+" degree Fahrenheit is equal to "+Celsius+" in Celsius.");
		System.out.println();
		
		System.out.println("5.Write a Java program to break an integer into a sequence of individual digits.");
		int[]num = new int[] {1,2,3,4,5,6};
		   for(int i:num) {
			   System.out.print(i+" "); 
		   }
		System.out.println();
		
		System.out.println("6.Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.");
		int f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input an integer between 0 and 1000:");
		f = sc.nextInt();
		int firstNumber = f % 10;
		int g = f / 10;
		int secondNumber = g % 10;
		g = g / 10;
		int thirdNumber = g % 10;
		g = g / 10;
		int fourthNumber = g % 10;
		System.out.println("The sum of all digits in "+f+" is "+(firstNumber+secondNumber+thirdNumber+fourthNumber));
		System.out.println();
		
		System.out.println("7.Write a Java program that accepts two integers from the user and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), and the minimum (smaller of the two integers).");
		int[] var = new int[2];
		System.out.println("Please input 2 integers:");
		for(int i=0;i<2;i++) {
			var[i] = sc.nextInt();
		}
			System.out.println("Sum of two integers: "+(var[0]+var[1]));
			System.out.println("Difference of two integers: "+(var[0]-var[1]));
			System.out.println("Product of two integers: "+(var[0]*var[1]));
			System.out.println("Average of two integers: "+((float)(var[0]+var[1])/2));
			System.out.println("Distance of two integers: "+(var[0]-var[1]));
			if(var[0]>var[1]) {
				System.out.println("Max integer: "+var[0]);
			}else {
				System.out.println("Max integer: "+var[1]);
			}
			if(var[0]<var[1]) {
				System.out.println("Min integer: "+var[0]);
			}else {
				System.out.println("Min integer: "+var[1]);
			}
		System.out.println();
		
		System.out.println("8.Write a Java program to print the ascii value of a given character.");
		char k = 'Z';
		int ascii = k;
		System.out.println("The ASCII value of " +k+ " is :" +ascii);
		System.out.println();
		
		System.out.println("9.Write a Java program to convert a string to an integer in Java.");
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Input a number(string): ");
		String str = sc3.next();
		int result = Integer.parseInt(str);
		System.out.println("The integer value is: "+result);
		System.out.println();
		
		System.out.println("10.Write a Java program to convert seconds to hour, minute and seconds.");
		Scanner sc4 = new Scanner(System.in);
		System.out.print("Input seconds: ");
		int seconds = sc4.nextInt();
		
		int time = seconds/3600;
		int minute = seconds%3600/60;
		int second = seconds%3600%60;
		
		System.out.println(time+":"+minute+":"+second);
		System.out.println();
		
    }
}
