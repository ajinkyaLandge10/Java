package Super_This_Keywords;

//@formatter:off
public class Car {

	int speed = 100;

	public Car() {
		System.out.println("Car constructor...");
	}

	public Car(int a) {
		this(10,20); //this should be 1st statement in constructor
		System.out.println("Car constructor..." + a);
	}
	
	public Car(int a, int b) {
		this();
		System.out.println("Car constructor..." + (a + b));
	}
	
	public void displayInfo() {
		System.out.println("Car--Info");
	}
}
/*
super: Pointing to the parent class object
	- 1. In the child class constructor.. but it should be the 1st statement in the child class constructor...methods.
	- 2. When you have same properties (Method overriding/same variable) in parent and child but you want to call/access parent class properties -- use super keyword

this: pointing to the current class object
	- 1. can call other constructor.. in the same class
	- 2. either this() or super()
	- 3. should be the 1st statement in the constructor...
	- 4. to initialize the instance variables with the local variables in constructor & Methods 
	- 5. can return this keyword also from the method - Builder pattern
*/