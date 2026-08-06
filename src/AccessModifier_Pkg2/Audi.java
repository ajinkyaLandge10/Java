package AccessModifier_Pkg2;

import AccessModifier_Pkg1.Car;

public class Audi extends Car {
	
//	Public & Protected Allowed in SubClass with different Package -- Private & Default Not Allowed
	
	public static void main(String[] args) {
		
		Audi a = new Audi();
		System.out.println(a.name);
		System.out.println(a.modelNumber);
	}

}
