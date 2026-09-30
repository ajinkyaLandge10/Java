package CollectionsPract;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Ex_01 {
	public static void main(String[] args) {
		
// 1) Declare ArrayList : 
// 		ArrayList<Integer> ar=new ArrayList<Integer>(); 	// only accepts Integers
// 		ArrayList<String> ar=new ArrayList<String>(); 		// only accepts Strings
// 		ArrayList al=new ArrayList(); 						// accepts all data type values
		List al = new ArrayList();

// 2) How to add individual values in to ArrayList:
		al.add(200);
		al.add("Welcome");
		al.add(12.33);
		al.add('A');
		al.add(true);
		System.out.println(al);

// 3) Size of array list- size()
		System.out.println(al.size());

// 4) Remove values from ArrayList - remove()
		al.remove(2); // remove value from 2nd place, here 2 is index, index starts from 0
		System.out.println("After removing:" + al);

// 5) Inserting Element using index
		al.add(2, "Java");
		System.out.println("After insertion :" + al);

// 6) How to read specific value
		System.out.println(al.get(2)); // Java here 2 is index

// 7) changing the element
		al.set(2, "JavaScript");
		System.out.println("After setting new value:" + al);

// 8) searching element - contains()
		System.out.println(al.contains("JavaScript"));

// 9) isEmpty()
		System.out.println(al.isEmpty());

// Reading ArrayList
		System.out.println("***** Iterate ArrayList using class loop *****");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

		System.out.println("***** Iterate ArrayList using For each loop *****");
		for (Object value : al) {
			System.out.println(value);
		}

		System.out.println("***** Iterate ArrayList using Iterator *****");
		Iterator itr = al.iterator();// getting the Iterator
		while (itr.hasNext())// check if iterator has the elements
		{
			System.out.println(itr.next());// printing the element and move to next
		}

		
	}
}
