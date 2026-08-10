package CollectionsFramework;

import java.util.List;
import java.util.Vector;

//@formatter:off
public class List_VectorConcept {

	public static void main(String[] args) {
/*
 	Vector: 
 		- Implements List interface, creates resizable-array similar to ArrayList.
 		- Difference between Vector & ArrayList
 			- Vector class Synchronized.
 			- When 2 threads try to access vector at the same time it will throw exception --> ConcurrentModificationException
 			- In ArrayList methods are not synchronized.in AL Collections.synchronized() method synchronizes list as whole.
 			- Vectors are not as efficient as ArrayList
 			- All Methods of ArrayList are present in Vector
 */
		
//		Declaration
//		1.Collection<Integer> collection= new Vector<>();
//		2.List<Integer> list= new Vector<>();
//		3.Vector<Integer> vector = new Vector<>();
		
		List<Integer> list = new Vector<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Printing Entire List : " + list); //[10, 20, 30]
		
	}

}
