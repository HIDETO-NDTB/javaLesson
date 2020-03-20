package week2;

class Employee{
	
	public static int base = 10000;
	int salary() {
		return base;
	}
}

class Manager extends Employee{
	int salary() {
		return base + 20000;
	}
}

class Clerk extends Employee{
	int salary() {
		return base + 10000;
	}
}

public class Method_Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Manager();
		System.out.println("Manager's Salary:"+obj.salary());
		
		Employee obj1 = new Clerk();
		System.out.println("Clerk's Salary:"+obj1.salary());
	}

}
