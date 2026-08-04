package basicProgramming;

import java.util.ArrayList;

public class ArrayListConcept {
//@formatter:off
	public static void main(String[] args) {
		
//		Dynamic Array: size is not fixed
//		ArrayList -- default class
//		methods
//		internal implementation of AL
//		Virtual Capacity(VC), Load Factor(LF)
//		index based
		
		ArrayList ar = new ArrayList(); //Empty array list -- size = 0
		System.out.println(ar.size()); //0
		System.out.println(ar); // Empty AL --> []
		
		ar.add(100);//0
		ar.add(200);//1
		
		System.out.println(ar.size()); //2
		
		ar.add(300);//2
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size()); //5
		
		ar.add(600);//5
		ar.add(700);//6
		
		System.out.println(ar.size()); //7
		
		ar.add(12.33);//7
		ar.add(true);//8
		ar.add("selenium");//9
		
		System.out.println(ar.size()); //10
		
		System.out.println(ar.get(0)); //100
		System.out.println(ar.get(9)); //Selenium
//		System.out.println(ar.get(10));//IndexOutOfBoundsException - IOB
//		System.out.println(ar.get(-1));//IOB
		
		ar.add(1000);//10
		System.out.println(ar.get(10));
		ar.add("selenium");//11
		ar.add(null);//12
		
		System.out.println(ar.size());
		System.out.println(ar);
		
		System.out.println();
		
		ArrayList ar1 = new ArrayList();//VC=10,PC=0
		System.out.println(ar1.size());//0
		ar1.add(10);
		System.out.println(ar1.size());//VC=9,PC=1
		
		System.out.println();
		
		ArrayList ar2 = new ArrayList(20);//PC=0,VC=20 [0-19]--> 19th -- added ---> PC/2=20/2=10
		ArrayList ar3 = new ArrayList(7);//PC=0,VC=7--->7/2=3
	
		
//		Number in the List
//		Generics
		ArrayList<Integer> numList = new ArrayList<Integer>();
		numList.add(100);
		
		ArrayList<Double> li = new ArrayList<Double>();
		li.add(12.33);
		li.add(100.0);
		
		ArrayList<String> empNamesList = new ArrayList<String>();//VC=10.PC=0
		empNamesList.add("Ajinkya");//0
		empNamesList.add("Neha");//1   ___ VC=8,PC=2
		System.out.println(empNamesList);
		
		System.out.println();
		
		ArrayList<Object> infoList = new ArrayList<Object>();
		infoList.add("Selenium");
		infoList.add(4.56);
		infoList.add(true);
		infoList.add(2007);
		infoList.add('A'); // PC=5,VC=5
		
		System.out.println(infoList);
	}

}
