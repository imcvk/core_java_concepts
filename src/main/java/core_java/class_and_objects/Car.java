package core_java.class_and_objects;

public class Car {
	String name;
	int MAX_SPEED;
	int NO_OF_SEATS;
	float fuel;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMAX_SPEED() {
		return MAX_SPEED;
	}
	public void setMAX_SPEED(int mAX_SPEED) {
		MAX_SPEED = mAX_SPEED;
	}
	public int getNO_OF_SEATS() {
		return NO_OF_SEATS;
	}
	public void setNO_OF_SEATS(int nO_OF_SEATS) {
		NO_OF_SEATS = nO_OF_SEATS;
	}
	public float getFuel() {
		return fuel;
	}
	public void setFuel(float fuel) {
		this.fuel = fuel;
	}

}
