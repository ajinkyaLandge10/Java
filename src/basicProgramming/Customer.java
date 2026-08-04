package basicProgramming;

public class Customer {

//	customer class variables:
	String firstName;
	String lastName;
	String email;
	String telephone;
	String password;
	boolean subscribe;

	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.firstName = "Neha";
		c1.lastName = "Yadav";
		c1.password = "Neha@123";
		c1.subscribe = true;
		
		Customer c2 = new Customer();
		c2.firstName = "Rakesh";
		c2.lastName = "Sharma";
		
		Customer c3 = new Customer();
		c3.firstName = "Siddharth";
		
		Customer c4 = new Customer();
		c4.firstName = "Sakshi";
		c4.email = "Sakshi@gmail.com";
		c4.lastName = "Bhatt";
		c4.telephone = "9898989898";
		c4.subscribe = false;
		c4.password = "Sakshi@123";
		
		new Customer();

	}

}
