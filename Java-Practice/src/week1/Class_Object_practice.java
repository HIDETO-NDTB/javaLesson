package week1;

public class Class_Object_practice {
	
	String name;
	String color;
	int distance;
	

	public Class_Object_practice(String name, String color, int distance) {
		this.name = name;
		this.color = color;
		this.distance = distance;
	}



	public String getName() {
		return name;
	}



//	public void setName(String name) {
//		this.name = name;
//	}



	public String getColor() {
		return color;
	}



//	public void setColor(String color) {
//		this.color = color;
//	}



	public int getDistance() {
		return distance;
	}



//	public void setDistance(int distance) {
//		this.distance = distance;
//	}
	
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("私の車は"+this.getName()+"で、色は"+this.getColor()+"で走行距離は"+this.getDistance()+"です。");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Class_Object_practice obj = new Class_Object_practice("Outback","Black",33200);
        System.out.println(obj.toString());
		
//		obj.setName();
//		obj.setColor();
//		obj.setDistance();
		
//		System.out.println("Name: "+obj.getName());
//		System.out.println("Color: "+obj.getColor());
//		System.out.println("Distance: "+obj.getDistance());
	}

}
