package Logical_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FIrstNonRepeatingChar {

	public static void main(String[] args) {
		String str ="swiss";
		
		Map<Character, Integer> freq = new LinkedHashMap<>();
		
		for(char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0)+1);
		}
		
		for(char ch: str.toCharArray()) {
			if(freq.get(ch) == 1) {
				System.out.println("First Non-Repeating : " + ch);
				break;
			}
		}

	}

}
