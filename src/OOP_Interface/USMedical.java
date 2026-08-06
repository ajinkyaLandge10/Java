package OOP_Interface;

//@formatter:off
/*
	- A method which don't have method body is a Abstract method.
	- Abstract method-->Only declaration no definition
	- Can not create the object of Interface in Java
	- Interfaces cannot have constructors
	- All abstract... methods are non static
	- Abstract method can't be static in nature - as we are going to override and implement abstract method and if static we cannot override it.

		Child 					Parent
		Class  		extends  	Class
		Class  		implements	Interface
		Interface   extends		extends
		Interface	NA			Class
*/
public interface USMedical extends WHO {
	
	int MIN_fEE = 10; //All the variables in interface are static and final by default

//	100% abstraction(OOP)
	public void physioServices();
	public void oncologyServices();
	public void pediaServices();
	public void emergencyServices();
	
	
//	After JDK 1.8: Two major changes:
//	1. can have static method but with method body:
	public static void billing() {
		System.out.println("USMedical --> billing");
	}
	
//	2. can have a default method with method body: non static:
	default void RnD(){
		System.out.println("USMedical --> R&D");
	}
	
}
