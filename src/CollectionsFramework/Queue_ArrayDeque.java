package CollectionsFramework;
//@formatter:off
import java.util.ArrayDeque;
import java.util.Deque;

public class Queue_ArrayDeque {
	public static void main(String[] args) {
		
//Implementation of Queue using ArrayDeque
		Deque<Integer> q = new ArrayDeque<>();	
//offer
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offerFirst(10);
		q.offerLast(50);
		System.out.println(q); //[10, 20, 30, 40, 50]
//poll		
		q.pollFirst();
		System.out.println(q); //[20, 30, 40, 50]
		q.pollLast();
		System.out.println(q); //[20, 30, 40]
//size		
		System.out.println(q.size()); //3
//peek
		System.out.println(q.peek()); //20
		System.out.println(q.peekFirst()); //20
		System.out.println(q.peekLast()); //40
		
		
		
		System.out.println("----------------------");
		
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		System.out.println(stack); //[300, 200, 100]
		
		stack.pop();
		System.out.println(stack); //[200, 100]
		System.out.println(stack.peek()); //200
	}

}
