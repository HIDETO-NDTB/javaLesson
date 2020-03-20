package week1;

public class Method_Types {
	
	public void Method1() {
		System.out.println("Method without return type and paramater");
	}
	
	public int Method2() {
		System.out.print("Method with return type and without paramater");
		return 1 + 2;
	}
	
	public void Method3(String name) {
		System.out.println("Method without return type and with paramaters: "+name);
	}
	
	public int Method4(int x,int y) {
		System.out.print("Method with return type and paramaters");
		return x * y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Types obj = new Method_Types();
		
		obj.Method1();
		
		System.out.println(obj.Method2());
		
		obj.Method3("John");
	    
		System.out.println(obj.Method4(4,  5));

	}

}
