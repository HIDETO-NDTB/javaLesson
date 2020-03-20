package week2;

class Father{
	public void print(){
		System.out.println("I am Father class");
	}
}

class ChildOne extends Father{
	public void display() {
		System.out.println("I am child1 class");
	}
}

class ChildTwo extends Father{
	public void show() {
		System.out.println("I am child2 class");
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ChildOne c1 = new ChildOne();
		c1.print();
		c1.display();
		
		ChildTwo c2 = new ChildTwo();
		c2.print();
		c2.show();
	}

}
