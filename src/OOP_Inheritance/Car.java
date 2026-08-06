package OOP_Inheritance;
//@formatter:off
public class Car extends Vehicle {

	int maxSpeed = 100;

	// final Method: can not be overridden : To prevent method overriding
	// final class: can not be a parent class: To prevent inheritance
	// Static Method : can not be overridden
	// Private Method : can not be Overridden & also can't be accessed Outside class so create a public layer and call
	// Protected Method : Can be Overridden
	// Default Method : Can be Overridden

	public void start() {
		System.out.println("Car --> start");
	}

	public void stop() {
		System.out.println("Car --> stop");
	}

	public void refuel() {
		System.out.println("Car --> refuel");
	}

//	Can not be Overridden
	public static void billing() {
		System.out.println("Car --> billing");
	}

//	Can not be overridden
	private void tyrePressure() {
		System.out.println("Car --> tyre pressure");
	}

	public void checkTypePressure() { // this is a public layer for tyrePressure Method which is private
		tyrePressure();
	}

	protected void selling() {
		System.out.println("Car --> selling");
	}

}
