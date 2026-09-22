package Logical_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharactersInString {

	public static void main(String[] args) {
		String str = "Programming";

		Map<Character, Integer> freq = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		System.out.println(freq);
	}
}
