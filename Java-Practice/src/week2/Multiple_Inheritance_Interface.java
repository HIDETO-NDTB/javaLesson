package week2;

interface one{
	public void print_hello();
}

interface two{
	public void print_welcome();
}

interface three extends one,two{
	public void print_hello();
}

class Child implements three{

	@Override
	public void print_welcome() {
		// TODO Auto-generated method stub
		System.out.print("Welcome ");
	}

	@Override
	public void print_hello() {
		// TODO Auto-generated method stub
		System.out.print("Hello ");
	}
	
}

public class Multiple_Inheritance_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
		obj.print_hello();
		obj.print_welcome();
	}

}
