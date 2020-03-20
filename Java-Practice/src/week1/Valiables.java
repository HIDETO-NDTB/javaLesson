package week1;

public class Valiables {

	//static variables
	static int c=20;
	
	//instance variables
	int a=10;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(c);
		
		Valiables obj = new Valiables();
		System.out.println();
		
		obj.display();
	
		
	}
	public void display() {
		int b=30;
		System.out.println(b);
	}
	

}

