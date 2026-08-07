package BuilderPattern;

//@formatter:off
public class ShoppingTest {

	public static void main(String[] args) {
		Ecommerce e1 = new Ecommerce();

		e1.login("admin@gmail.com", "admin123")
			.search("Laptop")
				.selectProduct("Macbook Air")
					.addToCart("Macbook Air")
						.doPayment("9876 5432 1234 5678", 123)
							.generaterOrderId()
								.logout();
		
		System.out.println("------------");
		
		e1.login("admin@gmail.com", "admin123")
			.search("Shoes", "Red")
				.selectProduct("Nike AirMax")
					.logout();
		
		System.out.println("------------");
		
		e1.login("admin@gmail.com", "admin123")
			.search("Mobile", "Black")
				.selectProduct("Iphone 17")
					.addToCart("Iphone 17")
						.logout();
		
		System.out.println("------------");
		
		e1.login("admin@gmail.com", "admin123")
			.logout();
		
		System.out.println("------------");
		
			e1.login("admin@gmail.com", "admin123");
			
		System.out.println("------------");
		
		e1.login()
			.search("Mobile", "Black")
				.selectProduct("Iphone 17")
					.addToCart("Iphone 17")
						.doPayment("9876 5432 1234 5678", 123)
							.generaterOrderId()
								.logout()
									.login("admin@gmail.com", "admin123")
										.search("Laptop")
											.selectProduct("Macbook Air")
												.addToCart("Macbook Air")
													.doPayment("9876 5432 1234 5678", 123)
														.generaterOrderId()
															.logout();
		
	}

}
