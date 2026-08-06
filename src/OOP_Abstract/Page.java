package OOP_Abstract;
//@formatter:off
public abstract class Page {

/*
	- JVM will look only for default constructor in parent class
	- JVM will add one hidden default constructor internally if no Constructor is present
	- it will not hit the parameterize constructor until we use Super keyword in child class
*/
	
//	default constructor....
	public Page() {
		System.out.println("Page constructor...");
	}
	
//	parameterized constructor
	public Page(int a) {
		System.out.println("Page constructor..." + a);
	}
	
/*	
	- Abstract class can't have object/ can't create/instantiate the abstract class
	- Abstract class can have the constructor & it will be called when you create the object of child class
	- Abstract class can have abstract method & non abstract methods
	- No abstract methods:- 0% abstraction
	- Only abstract methods:- 100% abstraction
	- Abstract + Non Abstract methods:- [0-100%] partial abstraction
*/	
	public abstract void title();
	public abstract void url();
	public void pageLoadTime() {
		System.out.println("Page load time out = 10 secs");
	}
	public final void logo() {
		System.out.println("Display App logo");
	}
	
	
//	when to use abstract class : 0-100% abstraction
//	when to use Interface : 100% abstraction

}
