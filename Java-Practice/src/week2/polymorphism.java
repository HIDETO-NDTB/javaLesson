package week2;

public class polymorphism {
	
	public static void sum(int a, int b) {
		System.out.println("Sum: "+a+" and "+b+" = "+(a+b));
	}
	
	public static void sum(int a, int b,int c) {
		System.out.println("Sum: "+a+" , "+b+" and "+c+" = "+(a+b+c));
	}
	
	public static void multiply(double a, int b) {
		System.out.println("Product: "+a+" and "+b+" = "+(a*b));
	}
	
	public static void multiply(double a, double b) {
		System.out.println("Product: "+a+" and "+b+" = "+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sum(3,4);
		sum(3,4,5);
		
		multiply(10.5,2);
		multiply(12.5,2.5);
	}

}
