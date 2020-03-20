package week2;

interface vehicle{
	void changeGear(int a);
	void SpeedUp(int a);
	void applyBreak(int a);
}

class Bicycle implements vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear) {
		// TODO Auto-generated method stub
		gear = newGear;
		
	}
	@Override
	public void SpeedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
	}
	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("speed: "+speed+" Gear: "+gear);
	}
	
}

class Bike implements vehicle{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear) {
		// TODO Auto-generated method stub
		gear = newGear;
	}
	@Override
	public void SpeedUp(int increment) {
		// TODO Auto-generated method stub
		speed = speed + increment;
	}
	@Override
	public void applyBreak(int decrement) {
		// TODO Auto-generated method stub
		speed = speed - decrement;
	}
	
	public void printStates() {
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
	
}



public class Hybrid_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bicycle obj = new Bicycle();
		obj.changeGear(2);
		obj.SpeedUp(3);
		obj.applyBreak(1);
		
		
		System.out.println("Bicycle Present State: ");
		obj.printStates();
		
		Bike obj1 = new Bike();
		obj1.changeGear(1);
		obj1.SpeedUp(4);
		obj1.applyBreak(3);
		obj1.SpeedUp(2);
		
		System.out.println("Bike Present State: ");
		obj1.printStates();
		
	}

}
