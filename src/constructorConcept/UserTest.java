package constructorConcept;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		User u1 = new User("Akash");
		String[] akashDetails = u1.getUserOrderDetails("Akash");
		System.out.println(Arrays.toString(akashDetails));
		
		
		User u2 = new User("Neha",101);
		User u3 = new User("Priya", "Priya@gmail.com");

	}

}
