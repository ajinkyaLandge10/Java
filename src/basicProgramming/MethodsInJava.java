package basicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

//@formatter:off

public class MethodsInJava {
	String name;
/*	 - can not create a method inside a method
	 - can call a method inside a method
	 - methods are always independent//parallel to each other
	 - methods are class data members
	 - method: the behavior of the object/class
	 - duplicate methods are not allowed
*/	
	
	//1. No input and No return:
	//void: can not return any value
	//return type: void
	public void test() {//0 parameter -- no input
		System.out.println("Test method");
	}
	
	//2. no input but some return:
	//return type: int
	public int getInfo() {
		System.out.println("Get info method");
		int a = 10;
		int b = 20;
		int c = a+b;//30
		return c;
	}
	
	//return type: String
	public String getName() {
		System.out.println("Get name method");
		String name = "Ajinkya";
		return name;
	}
	
	//can we return multiple values from the method? --> NOOOOO
	//return type: ArrayList<String>
	public ArrayList<String> getEmpNames() {
		System.out.println("Get emp names...");
		String em1 = "Ajinkya";
		String em2 = "Rakesh";
		ArrayList<String> empList = new ArrayList<String>();//VC=10,PC=0
		empList.add(em1);//0
		empList.add(em2);//1
		return empList;
	}
	
	//return type: String[]
	public String[] getEmployee() {
		System.out.println("Get employee method");
		String emp[] = {"Ajinkya", "Sakshi"};
		return emp;
	}
	
	//3. some input and some return:
	public int sum(int a, int b) { //2 params
		System.out.println("Sum method");
		int total = a+b;
		return total;
	}
	
	public int sub(int a, int b) { //2 params
		System.out.println("Sub method");
		int sub = b-a;
		return sub;
	}
	
	public float getBillAmount(int foodBill, int drinksBill, float tax) {
		System.out.println("Generating bill amount..");
		float totalBill = foodBill + drinksBill + tax;
		return totalBill;
	}
	
	public int calculateMarks(int subjectMarks, int attendance, int handwriting) {
		int totalMarks = subjectMarks + attendance;
		return totalMarks;
	}
	
	public int calculateMarks(int subjectMarks) {
		int totalMarks = subjectMarks ;
		return totalMarks;
	}
	
	public Object[] getEmpInfo() {
		Object empInfo[] = {"Neha",30,12.33,true};
		return empInfo;
	}
	
	
	public static void main(String[] args) {		
//		call the method: create the object of the class
		MethodsInJava obj = new MethodsInJava();
		obj.name = "Neha";
		obj.test();
		
		int s = obj.getInfo();
		System.out.println(s);
		System.out.println(s+20-10);
		System.out.println(s+20-10-2);
//		System.out.println(obj.getInfo()+20); // not recommended --> Calling fn Multiple times
//		System.out.println(obj.getInfo()+20-10); // impact performance
		
		String n1 = obj.getName();//Ajinkya
		System.out.println(n1);
		System.out.println(n1 + " QA Automation");
		
		ArrayList<String> eList = obj.getEmpNames();
		System.out.println("Total emp : " + eList.size());
		System.out.println(eList);
		
		String employee[] = obj.getEmployee();
		System.out.println(employee.length);
		System.out.println(Arrays.toString(employee));
		
		int s1 = obj.sum(10, 20);//arguments/values
		System.out.println(s1);
		
		int s2 = obj.sum(30, 40);
		System.out.println(s2);
		
		float finalBill = obj.getBillAmount(100, 50, 0.5f);
		System.out.println(finalBill - 20 + 5);
		
		obj.calculateMarks(10, 2, 1);//args/value
//		calling a function/method by passing the value/arg: call by value/arg
		
		Object ob[] = obj.getEmpInfo();
		System.out.println(Arrays.toString(ob));
	}

}
