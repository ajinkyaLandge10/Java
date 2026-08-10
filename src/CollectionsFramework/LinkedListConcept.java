package CollectionsFramework;
import java.util.LinkedList;
//@formatter:off

public class LinkedListConcept {
	public static void main(String[] args) {
	
/*
		LinkedList : 
		- it is similar to ArrayList only difference is it does not store elements in contiguous memory location
		- it store elements in the form of node & node consist of 3 parts - 
				1. Previous node reference
				2. Actual value (Data)
				3. next node reference
		- Only clone method will not work in LinkedList
		- LinkedList also implements Queue & Dequeue Interfaces so it can implements methods of this also
*/
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Printing Entire List : " + list); //[10, 20, 30]
		
//		addFirst & addLast & removeFirst & removeLast
		list.addFirst(5);
		System.out.println(list); //[5, 10, 20, 30]
		list.addLast(5);
		System.out.println(list); //[5, 10, 20, 30, 5]
		list.removeFirst();
		System.out.println(list); //[10, 20, 30, 5]
		list.removeLast();
		System.out.println(list); //[10, 20, 30]
		
//		getFirst & getLast
		System.out.println(list.getFirst()); //10
		System.out.println(list.getLast()); //30
		
//		peek --> Returns the first element(head) of the LinkedList 
		System.out.println(list.peek());//10

//		poll --> Returns & Remove the first element from the LinkedList
		System.out.println("Before Polling : " +list);
		System.out.println("Polling : " + list.poll());
		System.out.println("After Polling : " +list);
		
//		offer --> adds the specified element at the end of the LinkedList 
		System.out.println("Before offer : " +list);
		list.offer(40);
		System.out.println("After offer : " +list);
		
		
	}

}
