package CollectionsFramework;
//@formatter:off
import java.util.HashSet;
import java.util.Set;

public class Set_HashSet {
	public static void main(String[] args) {
/*  
 	HashSet: 
		- Duplicates are not allowed
		- Order is not Maintained in case of HashSet (Random Order)
		- Because elements in HashTable are accessed using hash codes(unique identity)
		- Each element has a unique HashCode
		- Time Complexity -> O(1)
*/
// Implementation of Set using HashSet	
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(10);
		st.add(20);
		st.add(20);
		st.add(30);
		st.add(40);
		System.out.println(st);
		
		System.out.println("-------------------");
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
//		retainAll --> Retains common element from both the set (Intersection)
		System.out.println(set1);
		set1.retainAll(set2);
		System.out.println(set1);
		
		System.out.println("------------");
		
//		containsAll -- returns boolean if exist (SubSet)
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1.containsAll(set2));//false
		System.out.println(set2.containsAll(set1)); //true
		
		System.out.println("------------");
		
//		addAll --> Adds all of the elements in the specified collection to this set (Union)
		System.out.println(set1);
		System.out.println(set2);
		set1.addAll(set2);
		System.out.println(set1);
		
		System.out.println("------------");
		
//		removeAll --> Removes from this set all of its elements that are contained in the specified collection (Difference)
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2);
		System.out.println(set1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
