package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start(); // Overridden
		b.stop(); // inherited
		b.refuel(); // inherited
		b.autoParking(); // individual 
		b.engine();// Overridden
		BMW.billing();
		System.out.println(b.maxSpeed);
		b.checkTypePressure();
		
		System.out.println("-------");
		
		Car c = new Car();
		c.start(); // individual
		c.stop();  // individual
		c.refuel(); // individual
		c.engine();// inherited
		Car.billing(); // individual
		
		System.out.println("-------");
		
//		Top/up casting:
//		1. child class object can be referred by parent class reference variable
		Car c1 = new BMW();
		c1.start();//Overridden -- BMW --> start
		c1.stop(); // individual -- Car --> stop
		c1.refuel(); // individual -- Car --> refuel
		c1.engine(); // inherited -- BMW --> engine
		
//		2. child class object can be referred by grand parent class reference variable:
		Vehicle v1 = new BMW();
		v1.engine();

//		down casting:
//		- Parent class object can be referred by child class reference variable -- Not Possible in java
//		BMW b1 = (BMW) new Car(); // casting will fool the compiler but at runtime it will throw --> ClassCastException
//		BMW b2 = (BMW) new Vehicle();// ClassCastException
		 
	}

}
