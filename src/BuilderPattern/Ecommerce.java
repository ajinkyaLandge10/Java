package BuilderPattern;
//@formatter:off
//Builder Pattern: It says that every method will return current class object - its kind of method chaining concept

public class Ecommerce {
	public Ecommerce login() {
		System.out.println("User is logged in");
		return this; // --> This statement returns current class object -->new Ecommerce(); & type of object is Ecommerce.
	}
	public Ecommerce login(String un, String pwd) {
		System.out.println("User is logged in with : " + un + " " + pwd);
		return this;
	}
	public Ecommerce search(String productName) {
		System.out.println("Searching product : " + productName);
		return this;
	}
	public Ecommerce search(String productName, String color) {
		System.out.println("Searching product : " + productName + " " + color);
		return this;
	}
	public Ecommerce selectProduct(String productName) {
		System.out.println("Selecting product : " + productName);
		return this;
	}
	public Ecommerce addToCart(String productName) {
		System.out.println("Adding product in the cart : " + productName);
		return this;
	}
	public Ecommerce doPayment(String cc, int cvv) {
		System.out.println("Making payment using card : " + cc + " : " + cvv);
		return this;
	}
	public Ecommerce generaterOrderId() {
		System.out.println("Order id is : " + 12345);
		return this;
	}
	public Ecommerce logout() {
		System.out.println("Logout");
		return this;
	}
	
}
