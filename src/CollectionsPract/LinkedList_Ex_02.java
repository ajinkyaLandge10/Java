package CollectionsPract;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Ex_02 {
	public static void main(String[] args) {

		LinkedList l1 = new LinkedList();

		l1.add("X");
		l1.add("Y");
		l1.add("Z");
		l1.add("A");
		l1.add("B");
		l1.add("C");

		LinkedList l2 = new LinkedList();
		l2.addAll(l1);
		System.out.println(l2); // [X, Y, Z, A, B, C]

		l2.removeAll(l1);
		System.out.println("After removing :" + l2); // []

		// Sort --- Collections.sort()

		System.out.println("Elements in the linked list:" + l1); // [X, Y, Z, A, B, C]
		Collections.sort(l1);
		System.out.println("Elements in the linked list after sorting:" + l1); // [A, B, C, X, Y, Z]

		Collections.sort(l1, Collections.reverseOrder());
		System.out.println("Elements in the linked list after sorting in reverse order:" + l1); // [Z, Y, X, C, B, A]

		// Shuffling - Collections. shuffle()

		Collections.shuffle(l1);
		System.out.println("Elements in the linked list after Shuffling:" + l1); // [A, C, X, B, Y, Z]

	}
}
