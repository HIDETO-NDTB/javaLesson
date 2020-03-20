package week1;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arithmetic Operators
		int num1 = 100;
		int num2 = 20;
		
		System.out.println("Num1 + Num2: "+(num1+num2));
		System.out.println("Num1 - Num2: "+(num1-num2));
		System.out.println("Num1 * Num2: "+(num1*num2));
		System.out.println("Num1 / Num2: "+(num1/num2));
		System.out.println("Num1 % Num2: "+(num1%num2));
		
		//assignment Operators
		int num3 = 10;
		int num4 = 20;
		
		num4 = num3;//num4=10 num3=10
		System.out.println(" = "+num4);
		
		num4 += num3; //num4 = num4+num3 num4=20 num3=10
		System.out.println(" += "+num4);
		
		num4 -= num3;//num4=10 num3=10 
		System.out.println(" -= "+num4);
		
		num4 *= num3;//num4=100 num3=10
		System.out.println(" *= "+num4);
		
		num4 /= num3;//num4=10 num3=10
		System.out.println(" /= "+num4);
		
		num4 %= num3;//num4=0 num3=10
		System.out.println(" %= "+num4);
		
		//Auto Increment and Auto Decrement Operators
		int num5 = 30;
		int num6 = 25;
		
		System.out.println("Num5++ "+num5++);
		System.out.println("Num5 "+num5);
		
		System.out.println("Num5++ "+(++num5));
		System.out.println("Num5 "+num5);
		
		System.out.println("Num6-- "+num6--);
		System.out.println("Num6 "+num6);
		
		System.out.println("Num6-- "+(--num6));
		System.out.println("Num6 "+num6);
		
		//Ternary Operator
		int a,b;
		a = 25;
		
		b = (a==25)? 100 : 200;
		System.out.println("b="+b);
		
		//Comparison / Relational Operators
		int num7 = 10;
		int num8 = 50;
		
		if(num7 == num8) {
			System.out.println("num7 and num8 are equel");
		}else {
			System.out.println("num7 and num8 are not equel");
		}
		
		if(num7 != num8) {
			System.out.println("num7 and num8 are not equel");
		}else {
			System.out.println("num7 and num8 are equel");
		}
		
		if(num7 > num8) {
			System.out.println("num7 is greater than num8");
		}else {
			System.out.println("num7 is not greater than num8");
		}
		
		if(num7 < num8) {
			System.out.println("num7 is less than num8");
		}else {
			System.out.println("num7 is not less than num8");
		}
		
		if(num7 >= num8) {
			System.out.println("num7 is greater than or equel num8");
		}else {
			System.out.println("num7 is less than num8");
		}
		
		if(num7 <= num8) {
			System.out.println("num7 is less than or equel num8");
		}else {
			System.out.println("num7 is greater than num8");
		}
		 
		//Logical Operators
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1 && b2: "+(b1 && b2));
		System.out.println("b1 || b2: "+(b1 || b2));
		System.out.println("!(b1 && b2): "+!(b1 && b2));

	}

}
