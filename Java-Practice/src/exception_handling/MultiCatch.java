package exception_handling;

import java.util.Random;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		
		try {
			int a = 10 / rand.nextInt(2);
			System.out.println(a);
			
			int[] arr = {1,2,3};
			System.out.println(arr[rand.nextInt(10)]);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Exception occured "+e);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Exception occured "+e);
			
		}
		
	}

}
