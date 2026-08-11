package Logical_Programs;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurance {

	public static void main(String[] args) {
		String str = "ajinkya landge".toLowerCase();
		str = str.replace(" ", "");
		char[] ca = str.toCharArray();
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : ca) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		for (Character c : m.keySet()) {
			System.out.println(c + " = " + m.get(c));
		}
	}

}
