package basicProgramming;
//@formatter:off
public class MethodOverloading {
	
/*		Method Overloading: OOP: Poly(many) + Morphism (forms): CompileTime(Static, early binding)
	 	When in the same class, we have different methods:
	 		1. With the same name
	 		2. With different number of parameters
	 		3. With different type of parameters
	 		4. return type does not matter
	 		5. Sequence of the parameter should be different
*/
	
		public void test() { // 0 param
			System.out.println("Test method");
		}
		public void test(int a) { // 1 param
			System.out.println("Test method: " + a);
		}
//		public int test(int a) { //1 param
//			System.out.println("test method: " + a);
//			return 100;
//		}
		public void test(String a) { // 1 param
			System.out.println("Test method: " + a);
		}
		public void test(int a, int b) { // 2 params
			System.out.println("Test method: " + a + b);
		}
		public void test(int a, String b) { // 2 params
			System.out.println("Test method: " + a + b);
		}
		public void test(String a, int b) { // 2 params
			System.out.println("Test method: " + a + b);
		}
		public void test(int c, float d) { // 2 params
			System.out.println("Test method: " + c + d);
		}
		
		
//		Example of Method Overloading : 
//		E-commerce:
		
		public void login(String un, String pwd) {
			System.out.println("Login with Username & Password : "+ un +" " +pwd);
		}
		public void login(String un, String pwd, int otp) {
			System.out.println("Login with Username,Password & OTP : "+ un +" " +pwd + " "+otp);
		}
		public void login(String un, String pwd, String ph) {
			System.out.println("Login with Username,Password & Phone : "+ un +" " +pwd + " "+ph);
		}
		public void login(String emailId) {
			System.out.println("Login with Email : "+ emailId);
		}
		
//		Search:
		public void search() {
			System.out.println("Searching Product");
		}
		public void search(String productName) {
			System.out.println("Searching Product by Name");
		}
		public void search(String productName, int price) {
			System.out.println("Searching Product by Name and Price");
		}
		public void search(String productName, int price, String seller) {
			System.out.println("Searching Product by Name Price and Seller");
		}
		
//		payment:
		public void doPayment(String upi) {
		}
		public void doPayment(String cc, int cvv) {
		}
		public void doPayment(String paypalId, String pwd) {
		}
		
//		Uber: booking():
		public void booking(String carType, String stPoint, String endPoint) {
		}
		public void booking(String carType, String stPoint, String endPoint, int passngers) {
		}
		
		
		
	public static void main(String[] args) {
		
		MethodOverloading m = new MethodOverloading();
		m.test();
		m.test(10);
		m.test("Selenium");
		m.test(10, 20);
		m.test(10, "Selenium");
		m.test("Selenium", 10);
		m.test(10, 12.33f);
		
		System.out.println();
		
		MethodOverloading m1 = new MethodOverloading();
		m1.login("admin123", "pass123");
		m1.login("admin123", "pass123", 1122);
		m1.login("admin123", "pass123", "9898989898");
		m1.login("admin123@gmail.com");
		

	}

}
