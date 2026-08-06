package AccessModifier_Pkg1;

public class Truck {
	
//	 Public,Protected & Default allowed in Non-Subclass with same package.---> Private Not Allowed
	
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.modelNumber);
		System.out.println(c.colour);
	}

}
