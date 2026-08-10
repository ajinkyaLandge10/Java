package CollectionsFramework;
//@formatter:off
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_LinkedHashSet {
	public static void main(String[] args) {
/*  
	 LinkedHashSet: 
		- Duplicates are not allowed
		- Order is Maintained
		- Time Complexity -> O(n)
*/	
//		Implementation of Set using LinkedHashSet	
		Set<Integer> st = new LinkedHashSet<>();
		st.add(40);
		st.add(10);
		st.add(10);
		st.add(20);
		st.add(20);
		st.add(30);
		System.out.println(st);

	}

}
