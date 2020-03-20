package week1;

class Bicycle{
	
	//properties
	public int gear;
	public int speed;
	
	//constructor
	public Bicycle(int gear ,int speed) {
		this.gear = gear;
		this.speed = speed;
	} 
	
	//Method
	
	public void applyBreak(int decrement) {
		speed -= decrement;
	}
	
	public void speedup(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("No of gears are "+gear+"\n"+"Speed of bicycle is "+speed);
	}
	
	
}

class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear,speed);
		this.seatHeight = seatHeight;
	}
	
	public void seatheight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return(super.toString()+"\nSeat Height is "+seatHeight);
	}
	
	
}

public class inheritance {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MountainBike mb = new MountainBike(3,100,25);
		System.out.println(mb.toString());

	}

}
