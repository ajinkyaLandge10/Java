package AccessModifier_Pkg1;

public class Car {

	public String name;
	private int price;
	protected int modelNumber;
	String colour;

//	 Public,Private,Protected,Default all are Allowed
	
	public static void main(String[] args) {

		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.price);
		System.out.println(c.modelNumber);
		System.out.println(c.colour);

	}

}
