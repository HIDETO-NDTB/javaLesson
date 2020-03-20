package exception_handling;

public class Throw_keyword {
	
	static void display() {
		try {
			throw new NullPointerException("demo");
		}catch(NullPointerException e) {
			System.out.println("Caught inside fun().");
			throw e;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	display();
        }
        catch(NullPointerException e) {
        	System.out.println("Exception in main");
        }

		
	}

}
