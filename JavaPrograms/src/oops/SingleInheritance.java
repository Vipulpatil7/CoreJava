package oops;
class Vehicle{
	String vname="Vehicle";
	void displayV()
	{
		System.out.println("Parent Class: "+vname);
	}
	void display() {
		System.out.println("Parent class display");
	}
}
class Bike extends Vehicle{
	int speed;
	String vname="Bike";
	void VehicleType() {
		System.out.println(" Type"+vname);
	}
	void dipSpeed() {
		System.out.println("Bike speed: "+speed);
	}
	void display() {
		super.display();
		System.out.println("Child class display");
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		v.display();
		v.vname="car";
		v.displayV();
		Bike b = new Bike();
		b.speed=100;
		b.dipSpeed();
		b.vname="honda";
		b.displayV();
		b.display();
		b.VehicleType();
		
	}

}
