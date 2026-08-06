package AccessModifier_Pkg1;

public class BMW extends Car {

//	 Public,Protected & Default Allowed in Subclass with same package.---> Private Not Allowed
	
	public static void main(String[] args) {

		BMW b = new BMW();
		System.out.println(b.name);
		System.out.println(b.modelNumber);
		System.out.println(b.colour);

	}

}
