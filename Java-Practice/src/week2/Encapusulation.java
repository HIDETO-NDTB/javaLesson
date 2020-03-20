package week2;

class Student{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class Encapusulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s = new Student();
		s.setName("sanjay");
		System.out.println(s.getName());
	}

}
