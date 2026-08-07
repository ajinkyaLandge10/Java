package Super_This_Keywords;

public class BMW extends Car {

	int speed = 200;

	public BMW() {
		super(20,30); //super should be 1st statement in child class constructor
//		this(10); -- this & Super cannot be together
		System.out.println("BMW constructor...");
	}
	
	public BMW(int p) {
		System.out.println("BMW constructor..." + p);
	}

	@Override
	public void displayInfo() {
		System.out.println("BMW--Info");
	}
	
	public void displayBMWInfo() {
		System.out.println("BMW--System info");
		System.out.println(speed); //200 --> Child class value
		System.out.println(super.speed); //100 --> Parent class value
		
		displayInfo();// BMW--Info  --> Child Class method
		super.displayInfo();// Car--Info --> Parent class Method
	}
}
