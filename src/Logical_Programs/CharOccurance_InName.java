package Logical_Programs;

import java.util.HashMap;

public class CharOccurance_InName {

	public static void main(String[] args) {
		String str = "ajinkya";
		HashMap<String, Integer> map = new HashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(String.valueOf(ch), map.getOrDefault(String.valueOf(ch), 0) + 1);
		}
		System.out.println(map);

	}

}
