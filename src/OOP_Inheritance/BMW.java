package OOP_Inheritance;
//@formatter:off
public class BMW extends Car {
	
	int maxSpeed = 200; // No concept of variable overriding -- just a variable in BMW

	
/*	Method Overriding: Poly(many) + Morphism(forms): RunTime(Dynamic/Late binding)
	when we have parent and child class:
		1. With the same method name
		2. With the same number of parameters/with the same sequence
		3. With the same return type
*/
	
	@Override
	public void start() {
		System.out.println("BMW --> start");
	}
	
	@Override
	public void engine() {
	System.out.println("BMW --> engine");
	}

	public void autoParking() {
		System.out.println("BMW --> auto parking");
	}
	
//	Method hiding : 
//	Static method which is present in parent class and same name static method is available in child class is Method Hiding
	public static void billing() {
		System.out.println("BMW --> billing");
	}
	
	@Override
	protected void selling() {
		System.out.println("BMW --> selling");
	}


}
