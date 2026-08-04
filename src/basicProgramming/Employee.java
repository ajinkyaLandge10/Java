package basicProgramming;
//@formatter:off

public class Employee {
//	class variables: class attributes
	String name;
	int empId;
	String dept;
	boolean isPerm;
	double salary;

	public static void main(String[] args) {
//		class: is a blueprint/template/category of the objects
//		Object/Instance: is a physical entity created from class template/category

//		Creating Object : with the help of new keyword
		Employee e1 = new Employee();
/*		Employee : class/ type of e1
		e1: object reference variable
		new : keyword
		new Employee(): Object
*/		
		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);

		e1.name = "Ajinkya";
		e1.empId = 1;
		e1.dept = "QA";
		e1.isPerm = true;
		e1.salary = 23.44;
		
		System.out.println(e1.name);
		System.out.println(e1.empId);
		System.out.println(e1.dept);
		System.out.println(e1.isPerm);
		System.out.println(e1.salary);
		
System.out.println();

		Employee e2 = new Employee();
		e2.name = "Neha";
		e2.empId = 2;
		e2.salary = 12.33;
		
		System.out.println(e2.name);
		System.out.println(e2.empId);
		System.out.println(e2.dept);
		System.out.println(e2.isPerm);
		System.out.println(e2.salary);
		
		
//		No reference object:
		new Employee().name = "Anusha";
		new Employee().empId = 3;
		
//		null reference object
		Employee e3 = new Employee();
		e3 = null;
		e3.name = "Ajinkya";//Null Pointer Exception (NPE)
//		null. ---> NPE
		
		System.gc();//No guarantee that GC will go to heap memory
		Employee e5;//stack
		e5 = new Employee();
		
	}

}
