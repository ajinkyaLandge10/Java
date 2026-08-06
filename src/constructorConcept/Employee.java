package constructorConcept;

public class Employee {

	String name;
	int id;
	double salary;

/*
	1.Constructor name is same as the class name
	2.It does not have any return type/ not even void
	3.Constructor can not return anything
	4.Constructor is not made for the business logic
	5.Constructor helps to initialize the class variables
	6.Constructor is restricting the unnecessary object creation 
	7.Constructor will be called after creating object
*/	
	
//	public Employee() { // 0 Param
//		System.out.println("default Constructor..");
//	}
//	public Employee(int a) { // 1 Param
//		System.out.println("1 param Constructor.." + a);
//	}
	public Employee(String name) {
		this.name = name;
	}
	public Employee(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public Employee(String name,int id,double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void test() {
		System.out.println("Test Method");
	}
	
	
	public static void main(String[] args) {
//		Employee e1 = new Employee(10); // 1 param Constructor..10
//		new Employee();// default Constructor..

		Employee e2 = new Employee("Akash");
		System.out.println(e2.name +"  "+e2.id+"  "+e2.salary);
		
		Employee e3 = new Employee("Priya",101);
		System.out.println(e3.name +"  "+e3.id+"  "+e3.salary);

		Employee e4 = new Employee("Neha", 102, 12.33);
		System.out.println(e4.name +"  "+e4.id+"  "+e4.salary);
		

	}

}
