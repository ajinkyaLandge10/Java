package CollectionsFramework;
import java.util.Stack;
//@formatter:off

public class List_StackConcept {
	public static void main(String[] args) {	
/*
 	Stack : 
 		- Stack is class which provides the functionality of stack data structure
 		- it extends vector class & implements List
 		- it works on the principle of LIFO(Last In First Out).
 */
		
//		Declaration & Methods
		Stack<Integer> list = new Stack<>();
		
//		push --> To push the elements inside stack
		list.push(10);
		System.out.println(list); //[10]
		list.push(20);
		System.out.println(list); //[10, 20]
		list.push(30);
		System.out.println(list); //[10, 20, 30]
		list.push(40);
		System.out.println(list); //[10, 20, 30, 40]

//		pop --> Removes Top(last added) Element from the stack
		list.pop();
		System.out.println(list); //[10, 20, 30]
		
//		peek --> For retrieving the Top(last added) Element from the stack
		System.out.println(list.peek()); //30
		
//		search --> Return index (starts from 1) if value is present and -1 if value is not present
		System.out.println(list.search(10)); //3
		System.out.println(list.search(30)); //1
		System.out.println(list.search(101)); //-1
		
//		empty --> Returns boolean
		System.out.println(list.empty());//false
		
	}
}
