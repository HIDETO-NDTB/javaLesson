package week2;

class Parent{
	public void print() {
		System.out.println("There is parent class");
	}
}

class Child1 extends Parent{
	public void display() {
		System.out.println("There is child one class");
	}
}

class Child2 extends Child1{
	public void show() {
		System.out.println("There is child two class");
	}
}


public class Multilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child2 obj = new Child2();
		obj.print();
		obj.display();
		obj.show();
	}

}
