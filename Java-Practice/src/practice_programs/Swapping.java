package practice_programs;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 20;
		
		//using third variable
		int num3 = num1;
		num1 = num2;
		num2 = num3;
		
		System.out.println("After Swapping");
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);
		
		//without using third variable
		num1 = num1 + num2;//30
		num2 = num1 - num2;//10
		num1 = num1 - num2;//20
		
		System.out.println("After Swapping");
		System.out.println("Num1 = "+num1);
		System.out.println("Num2 = "+num2);
		
	}

}
