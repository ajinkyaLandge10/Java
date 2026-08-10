package CollectionsFramework;

//@formatter:off
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_ArrayListConcept {
	public static void main(String[] args) {
		
//		Declaration of ArraList : 
//		1.Collection<Integer> c1 =new ArrayList<>();
//		2.List<Integer> l1 =new ArrayList<>();
//		3.ArrayList<Integer> list = new ArrayList<>();
		
		ArrayList<Integer> list1 = new ArrayList<>();
		
//Methods		
//		add --> Add an element to the list
		list1.add(10);
		list1.add(20);
		list1.add(30);
		System.out.println(list1); //[10, 20, 30]
		list1.add(40);
		System.out.println(list1); //[10, 20, 30, 40]
		
//		remove --> Removes an element from the list
		list1.remove(0);
		System.out.println(list1); //[20, 30, 40]
		
//		addAll --> Add all elements of one list to another
		List<Integer> list2 = new ArrayList<>();
		list2.add(101);
		list2.add(102);
		list2.add(20);
		
		list1.addAll(list2);
		System.out.println(list1); //[20, 30, 40, 101, 102, 20]
		
//		removeAll --> remove all 2nd list elements and common in both
		list1.removeAll(list2);
		System.out.println(list1); //[30, 40]
		
//		size --> Returns length of the list
		System.out.println(list1.size()); //2
		
//		clear --> Removes all elements from the list
		System.out.println("Printing list2 : " + list2); //[101, 102, 20]
		list2.clear();
		System.out.println(list2.size()); //0
		System.out.println(list2); //[]
		
		System.out.println("-------------------------");
		
		List<Integer> list3 = new ArrayList<>();
		list3.add(11);
		list3.add(12);
		list3.add(14);
		
//		get --> Fetching elements from list by respective index
		System.out.println(list3.get(0));//11
		System.out.println(list3.get(2));//14
		
//		set --> Replace/set the value by index
		System.out.println("Before set : "+list3);
		list3.set(0, 10);
		System.out.println("After set : "+list3);
		
//		toArray --> This method will convert any DataStructure(ArrayList,LL,Stack<Queue) to array type
		Object [] arr = list3.toArray();
		for(Object obj : arr) {
			System.out.println(obj);
		}
		
//		contains --> Check whether element is present in list or not returns boolean
		System.out.println(list3.contains(10));//true
		System.out.println(list3.contains(55));//false
		
		System.out.println("-------------------------");
			
		ArrayList<Integer> list4 = new ArrayList<>();
		list4.add(30);
		list4.add(20);
		list4.add(50);
		list4.add(60);
		System.out.println("Printing Entire list : " + list4);
		
//		sort --> sort an ArryaList in Ascending/Descending order
		Collections.sort(list4);
		System.out.println("Ascending Order : "+ list4);
		
		Collections.sort(list4,Collections.reverseOrder());
		System.out.println("Descending Order : "+ list4);
		
		
//		clone --> This method will clone/copy values from existing list to newList
		ArrayList<Integer> newList = (ArrayList<Integer>) list4.clone();
		System.out.println("Old List : " +list4);
		System.out.println("New List : " +newList);
		
//		ensureCapacity --> This method helps to ensure minimum capacity of AL initially so that it will not change dynamically --> Helps performance
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.ensureCapacity(100);
		
//		isEmpty --> Checks if ArrayList is Empty or not returns boolean
		System.out.println(newList.isEmpty());//false
		System.out.println(marks.isEmpty()); // true
		
//		indexOf --> This methods return index of specific element present in ArraList
		System.out.println(newList.indexOf(50)); //1
		System.out.println(newList.indexOf(20)); //3
		System.out.println(newList.indexOf(200)); //-1 --> if elements is not present it will return -1
		
		
		System.out.println("Printing Entire List : " + newList);
		newList.add(50);
		newList.add(60);
		newList.add(50);
		newList.add(210);
		System.out.println("Printing Entire List : " + newList);
		
//		lastIndexOf --> This methods return last index of specific element
		System.out.println(newList.lastIndexOf(50));//6

	}
}
