package exception_handling;

public class Throws_keyword {
	
	static void print() throws IllegalAccessException{
		System.out.println("Inside fun().");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread.sleep(1000);
		System.out.println("Hello Java");
		
		try {
			print();
		}catch(IllegalAccessException e) {
			System.out.println("Exception is main");
		}
	}

}
