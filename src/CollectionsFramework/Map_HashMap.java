package CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//@formatter:off
/*
 	Map :
 		- Map is an Interface
 		- Stores elements in key-Value pair
 		- Keys are unique ,values associated with individual values . Values can be duplicate
 		- Each key is associated with single value
		- Map Interface is implemented By Following Concrete Classes
			1.HashMap
			2.TreeMap
			3.EnumMap
			4.LinkedHashMap
			5.WeakHashMap
		- Does not Guarantee any specific Order
		- Maps Allow only one null key but multiple null values
		- HashTable Does not allow null key or value
 */
public class Map_HashMap {
	public static void main(String[] args) {
		
// Implementation of Map using HashMap
		Map<String, String> map1 = new HashMap<>();
		
//Methods of Map:
//		Insertion --> To add entry in map
		map1.put("In", "India");
		map1.put("In", "India2"); // here In key will start pointing to latest value
		map1.put("Us", "United States");
		map1.put("En", "England");
		map1.put("Aus", "Australia");
		System.out.println(map1);
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("Br", "Brazil");
		System.out.println("Before : " +map2);
		
//		putAll --> Copies all of the mappings from the specified map to this map
		map2.putAll(map1);
		System.out.println("After : " +map2);
		
//		remove --> To Remove Specific entry by providing key
		map2.remove("En");
		System.out.println(map2);
		
//		size --> returns size , Clear --> Remove all entries from map
//		System.out.println(map2.size());
//		map2.clear();	
//		System.out.println(map2.size());
		
//		putIfAbsent --> if Specified key is not associated with any value then it will add value. if entry present it will not override
		map2.putIfAbsent("Ger", "Germany");
		System.out.println(map2);
		
//		get --> Returns corresponding value of Specified Key
		System.out.println(map2.get("Aus"));
		
//		getOrDefault --> Return value of Specified key if present otherwise return default value
		System.out.println(map2.getOrDefault("Us", "None"));
		System.out.println(map2.getOrDefault("Usa", "None"));
		
//		containsKey -- Returns boolean if key is present 
		System.out.println(map2.containsKey("In"));
		System.out.println(map2.containsKey("Pol"));
		
//		containsValue -- Returns boolean if value is present 
		System.out.println(map2.containsValue("Germany"));
		System.out.println(map2.containsValue("Poland"));
		
		System.out.println("------------------------------");
		
		System.out.println(map2);
		
//		replace --> Replace the value of Specified key
		map2.replace("In", "India");
		System.out.println(map2);
		
//		KeySet --> Returns all the key from the map to set
		Set<String> keySet = map2.keySet();
		System.out.println(keySet);
		
//		value --> Returns all the values from map to collection
		Collection<String> valueSet= map2.values();
		System.out.println(valueSet);
		
//		entrySet --> Returns all Entries from map
		Set<Map.Entry<String, String>> entrySet = map2.entrySet();
		System.out.println("Printing Entries : " + entrySet);
		
		
		System.out.println("--------------");
		
//		Iteration Over Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Neha");
		map.put(2, "Akash");
		map.put(3, "Priya");
		map.put(4, "Ajinkya");
		map.put(5, "Sakshi");
		
		//for each loop
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key :" + entry.getKey() + ", Value : " + entry.getValue());
		}
		
		System.out.println();
		
		//for loop
		List<Integer> keyList = new ArrayList<>(map.keySet());
		for (int i = 0; i < keyList.size(); i++) {
		    Integer key = keyList.get(i);
		    String value = map.get(key);
		    System.out.println("Key : " + key + ", Value : " + value);
		}
		
		
		
		
		

	}
}
