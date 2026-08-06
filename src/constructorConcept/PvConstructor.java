package constructorConcept;

//@formatter:off
public class PvConstructor {

/*
	- By creating private constructor we can prevent object creation
	- In java System class have private constructor so no one can create object of system class
	- What kind of methods we create in this class -- static methods--so without creating object we can access them directly through class name
*/	
	private PvConstructor() {
		System.out.println("This is Private Constructor....");
	}
}
