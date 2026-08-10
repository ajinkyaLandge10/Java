package CollectionsFramework;

import java.util.LinkedList;
import java.util.Queue;

//@formatter:off

public class Queue_LinkedList {
	public static void main(String[] args) {
/*
 		Queue : 
 			- Queue is an interface which extends collection Interface
 			- It can be implemented by using following 3 classes
 				1. ArrayDeque
 				2. LinkedList
 				3. PriorityQueue
 			- Queue follows the FIFO (First In First Out) Principle
 			- When we add new Element in Queue it will get added at last and when we remove First one will be removed
 */
		
//Implementation of Queue using LinkedList
		Queue<Integer> q = new LinkedList<>();
//Methods:
		
//		add --> Insert element in the queue - returns true if successful if not throw exception(IllegalStateException)
//		offer --> Insert specified element in the queue -returns true if successful if not return false
		q.add(10);
		q.add(20);
		q.add(30);
		q.offer(40);
		q.offer(50);
		q.offer(60);
		System.out.println("Printing Entire Queue : " + q);
		
	
//		remove --> Returns and remove head of the queue - Throws exception if empty(NoSuchElementException).
//		poll --> Returns and remove head of the queue.returns null if queue is empty.
		System.out.println(q.remove());
		System.out.println(q.poll());
		System.out.println("Printing Entire Queue : " + q);
		
		
//		element --> Returns Head of the queue - Throws exceptions if queue is empty(NoSuchElementException).
//		peek --> Returns head of the queue.returns null if queue is empty
		System.out.println(q.element());
		System.out.println(q.peek());
		System.out.println("Printing Entire Queue : " + q);
		
	}

}
