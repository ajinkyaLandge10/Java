package CollectionsFramework;

//@formatter:off
import java.util.Set;
import java.util.TreeSet;

public class Set_TreeSet {
	public static void main(String[] args) {
/*  
	 TreeSet: 
		- Duplicates are not allowed
		- Sorted Order is Maintained
		- Time Complexity -> Based on Binary Search Tree O(logn)
*/			
//	Implementation of Set using TreeSet	
		Set<Integer> st = new TreeSet<>();
		st.add(40);
		st.add(10);
		st.add(10);
		st.add(20);
		st.add(20);
		st.add(30);
		System.out.println(st);
		
		
		
		
		
		
		
		
	}

}
