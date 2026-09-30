package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@formatter:off
public class Filter_Ex_01 {
	public static void main(String[] args) {
		
/*
	ArrayList <Integer>numbersList=new ArrayList<Integer>();
		numbersList.add(10);
		numbersList.add(15);
		numbersList.add(20);
		numbersList.add(25);
		numbersList.add(30);
*/
	List<Integer> numbersList = Arrays.asList(10, 15, 20, 25, 30);
	List<Integer> evenNumsList = new ArrayList<Integer>();

//	******* without using streams *******
	for(int n:numbersList) 
	{
		if(n%2==0) evenNumsList.add(n);
	}
	System.out.println(evenNumsList);

		
//	******* with streams *******
 	evenNumsList=numbersList.stream().filter(n->n%2==0).collect(Collectors.toList()); System.out.println(evenNumsList);


// 	numbersList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
	numbersList.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

	}
}
