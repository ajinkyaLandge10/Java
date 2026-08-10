package CollectionsFramework;
//@formatter:off
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueue {
	public static void main(String[] args) {
//Implementation of Queue using PriorityQueue		
			
//	Default behavior of PriorityQueue --> Integers --> Less Value->High Priority	
		Queue<Integer> pq = new PriorityQueue<>();//MinHeap	
		pq.offer(40);
		pq.offer(30);
		pq.offer(10);
		pq.offer(20);
		System.out.println(pq); //[10, 20, 30, 40]
		System.out.println(pq.poll());//10
		System.out.println(pq); //[20, 40, 30]
		System.out.println(pq.poll());//20
		System.out.println(pq); //[30, 40]
		
		System.out.println("-------------------------------");
		
		Queue<Integer> pq1 = new PriorityQueue<>((a,b)->b-a);//MaxHeap --High Value->High Priority	
		pq1.offer(40);
		pq1.offer(30);
		pq1.offer(10);
		pq1.offer(20);
		System.out.println(pq1); //[40, 30, 10, 20]
		System.out.println(pq1.poll());//40
		System.out.println(pq1); //[30, 20, 10]
		System.out.println(pq1.poll());//30
		System.out.println(pq1); //[20, 10]
		
	}

}
