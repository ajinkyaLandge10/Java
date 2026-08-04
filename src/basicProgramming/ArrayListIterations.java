package basicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
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
		
		System.out.println();
		
		
//		Different Ways Of Creating ArrayList
//		1. ArrayList ar1 = new ArrayList();
//		2. ArrayList<> ar2 = new ArrayList<>();
//		3. asList: ArrayList Literals
		
		ArrayList<String> langList =  new ArrayList<String>(Arrays.asList("Java", "Python", "C#"));//VC=10-->7
		System.out.println(langList.size());
		langList.add("Javascript");
		System.out.println(langList.size());
		
//		ArrayList Literals(Selenium UseCase): 
//		footer section: Contact Us, Privacy Policy, NewLetters
//		ActualList = Contact Us, Privacy Policy, NewLetters
//		ExpectedList = 
		ArrayList<String> footerList =  new ArrayList<String>(Arrays.asList("Contact Us", "Privacy Policy", "NewLetters"));//vc=10-->7
//		If(ActualList is equal to ExpectedList){
//				PASS
//		}
		
//		4.without using variable name
		ArrayList<String> list = new ArrayList<String>() {{
				add("Sameer");
				add("Ajinkya");
		}};
		System.out.println();
		
		
//		Practice Questions
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("Red");
		colors.add("Green");
		colors.add("Blue");
		colors.add("Yellow");
		System.out.println(colors);
		
		colors.set(1, "Purple");
		System.out.println(colors);
		
		colors.add(1, "Pink");
		System.out.println(colors);
		
		for(String color : colors) {
			System.out.println(color);
			if(color.equals("Blue")) {
				System.out.println("Blue color found....!");
		        break;
			}
		}
		System.out.println();
		
		 ArrayList<String> studentNames = new ArrayList<String>();
	        studentNames.add("Varun");//0
	        studentNames.add("Reena");//1
	        studentNames.add("Naveen");//2
	        studentNames.add("Robin");//3
	        studentNames.add("Peter");//4
	        
// Reverse the ArrayList
//	        1.
	        for(int st = studentNames.size()-1; st>=0; st--) {
	        	System.out.println(studentNames.get(st));
	        }
	        
//	        2.
	        System.out.println(studentNames);
	        Collections.reverse(studentNames);
	        System.out.println(studentNames);
	        
	        System.out.println();

// Swapping two Elements	        
	        System.out.println(studentNames);
	        Collections.swap(studentNames, 0, 1);
	        System.out.println(studentNames);
	        
	        System.out.println();
	        
// sorting ArraList	        
	        System.out.println(studentNames);
	        Collections.sort(studentNames);
	        System.out.println(studentNames);
	        
	        System.out.println();
	        
	        List<String> newList = Collections.EMPTY_LIST;
	        System.out.println(newList.size());//0
	        
	      List<Integer> marksList = Collections.emptyList();//Immutable List - empty
	      System.out.println(marksList);//[]
//	      marksList.add(200);//UnsupportedOperationException
//	      marksList.add(300);
//	      System.out.println(marksList);
	      
	      System.out.println();
	      
	      ArrayList<String> colorsList = new ArrayList<>();
	       colorsList.add("Red");
	       colorsList.add("Green");
	       colorsList.add("Blue");
	       colorsList.add("Yellow");
	       colorsList.add("Purple");
	       
	      ArrayList<String> portion = new ArrayList<>(colorsList.subList(0, 3));  
	      System.out.println(portion);
	      
	      System.out.println();
	      
//	Trim Virtual Capacity
	      ArrayList<String> colorsList1 = new ArrayList<>(20); // VC =20,PC=0
	      colorsList1.add("Red");
	      colorsList1.add("Green");
	      colorsList1.add("Blue");
	      colorsList1.add("Yellow");// VC=16,PC=4
	      
	      colorsList1.trimToSize(); // VC=16 --->4 This method will reduce VC to 4, After filling 20-->Upcoming VC=4
	      System.out.println(colorsList1.size());
	      
//	      iterate & Print AL:
//	      1. index based loop
	      for(int x=0; x<colorsList1.size(); x++) {
	          System.out.println(x + " = " + colorsList1.get(x));
	       }
	      System.out.println();
	      
//	      2. for each loop
	      int counter = 0;
	      for(String e : colorsList1) {
	    	  System.out.println(counter +" = " + e);
	    	  counter++;
	      }
	        
	}
}
