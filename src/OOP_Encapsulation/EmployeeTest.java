package OOP_Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
//		Employee e = new Employee();
//		
//		e.setName("Neha");
//		e.setId(101);
//		e.setCity("Pune");
//		e.setPerm(true);
//		
//		//
//		System.out.println(e.getName());
//		System.out.println(e.getId());
//		System.out.println(e.getCity());
//		System.out.println(e.isPerm());
		
//Usecase : 		
//		CRUD
		
//		User registration: setter & Constructor....Create : POST API
		Employee e = new Employee("Sakshi", 102, "Mumbai", false);
		
//		display info on user profile : getter ... Retrieve:GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
		
//		User wants to update city and name: setter: Update: PUT/Patch API
		e.setName("Sakshi QA");
		e.setCity("Pune");
		
//		display info on user profile: getter : Retrieve: GET API
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getCity());
		System.out.println(e.isPerm());
		

	}

}
