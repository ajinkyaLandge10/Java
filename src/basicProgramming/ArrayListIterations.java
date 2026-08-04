package basicProgramming;

import java.util.ArrayList;
//@formatter:off
public class ArrayListIterations {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);// 0
		numList.add(200);// 1 
		numList.add(300);// 2
		numList.add(400);// 3
		numList.add(500);// 4

		System.out.println(numList);

//		iterate the AL: using for loop:
		for (int i = 0; i < numList.size(); i++) {
			System.out.println(numList.get(i));
		}
		System.out.println();

//		iterate the AL: using for each:
		for (Integer e : numList) {
			System.out.println(e);
		}
		System.out.println();

		
		ArrayList<String> empNamesList = new ArrayList<String>();// VC=10.PC=0
		empNamesList.add("Ajinkya");// 0
		empNamesList.add("Neha");// 1
		empNamesList.add("Ritesh");// 2
		empNamesList.add("Priya");// 3
		empNamesList.add("Priya");// 4
		empNamesList.add(null);// 5
		empNamesList.add(null);// 6
		
		System.out.println(empNamesList);
		System.out.println();

//		iterate the AL: using for each:
		for (String e : empNamesList) {
			System.out.println(e);
		}
		System.out.println();
		
		
		
		ArrayList<String> studentList = new ArrayList<String>();//VC=10,PC=0
		
// Adding Element			
		studentList.add("Rahul");//0
		studentList.add("Aman");//1
		studentList.add("Pooja");//2
		
//		studentList.add(4, "Ajinkya"); --> IOB -> We Can't skip 3 index and add on 4 directly
//		System.out.println(studentList);
		
		studentList.add(3, "Ajinkya");
		System.out.println(studentList.get(3));
		
		System.out.println(studentList);
		
		studentList.add(0,"Amit");
		System.out.println(studentList);
	
// Removing Element		
		studentList.remove(0);
		System.out.println(studentList);
		
//		studentList.remove(7);//IndexOutOfBoundsException
//		System.out.println(studentList);

// Removing & adding Elements at same time	
		studentList.remove(0);
		studentList.add(0,"Rakesh");
		System.out.println(studentList);
		
		System.out.println(studentList.size());
		
// Replacing Elements		
		System.out.println(studentList);
		studentList.set(2, "Priya");
		System.out.println(studentList);
		
		

	}

}
