package week1;

class Hero{
	
	//要素
	public int power;
	public int speed;
	
	//constructor
	public Hero(int power, int speed) {
		this.power = power;
		this.speed = speed;
	}
	
	//機能
	public void powerup(int increment) {
		power += increment;
	}
	public void speedup(int increment) {
		speed += increment;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("パワーは"+power+"アップ\nスピードは"+speed+"アップ\n");
	}
}

class NewType extends Hero{
	public String newSkill;
	
	public NewType(int power, int speed,  String newSkill) {
		super(power,speed);
		this.newSkill = newSkill;
	}
	
	public void newSkill(String newValue) {
		newSkill = newValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"必殺技: "+newSkill;
	}
}

public class inheritance_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NewType nt = new NewType(100,120,"SexyBeam");
        System.out.println(nt.toString());
	}
}
