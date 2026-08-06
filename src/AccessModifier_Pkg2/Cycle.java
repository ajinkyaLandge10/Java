package AccessModifier_Pkg2;

import AccessModifier_Pkg1.Car;

public class Cycle {

//	Public is Allowed in SubClass with different Package -- Private, Protected & Default Not Allowed
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.name);

	}

}
