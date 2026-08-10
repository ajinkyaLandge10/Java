package CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorConcept {
	public static void main(String[] args) {
//		Iterator are used to traverse over the collection just like Loops
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		System.out.println(al);

		Iterator<Integer> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
