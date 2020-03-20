package week1;

public class Class_Object {
	
	String name;
	String breed;
	String color;
	int age;
	
	//Default Constructor
	public Class_Object() {
		System.out.println("Object Oriented Concept in Java");
	}

	//Parameterized Constructor
	public Class_Object(String name, String breed, String color, int age) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}



//	public void setName(String name) {
//		this.name = name;
//	}



	public String getBreed() {
		return breed;
	}



//	public void setBreed(String breed) {
//		this.breed = breed;
//	}



	public String getColor() {
		return color;
	}



//	public void setColor(String color) {
//		this.color = color;
//	}



	public int getAge() {
		return age;
	}



//	public void setAge(int age) {
//		this.age = age;
//	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("Hi my name is "+this.getName()+"\nMy breed,age and color are "+this.getBreed()+" "+this.getAge()+","+this.getColor());
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Class_Object obj = new Class_Object();
		Class_Object obj = new Class_Object("tuffy","papillon","white",5);
		System.out.println(obj.toString());
		
//		obj.setName();
//		obj.setBreed();
//		obj.setColor();
//		obj.setAge();
		
//		System.out.println("Name: "+obj.getName());
//		System.out.println("Breed: "+obj.getBreed());
//		System.out.println("Color: "+obj.getColor());
//		System.out.println("Age: "+obj.getAge());
	}


	
}
