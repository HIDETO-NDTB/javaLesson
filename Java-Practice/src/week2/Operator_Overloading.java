package week2;

public class Operator_Overloading {

	public static void operator(String str1,String str2) {
		String s = str1 + str2;
		System.out.println("Concatenated String - "+s);
	}
	
	public static void operator(int a,int b) {
		int c = a + b;
		System.out.println("Sum - "+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		operator(2,3);
		operator("John","doe");
	}

}
