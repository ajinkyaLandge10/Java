package Logical_Programs;

import java.util.HashMap;

public class CountOfCharacterOccurance {

	public static void getCharCount(String givenString) 
	{
			HashMap<Character,Integer>map=new HashMap<Character,Integer>();
			char charArray[]=givenString.toCharArray();
			for(char c:charArray)
			{
				if(map.containsKey(c))
				{
					map.put(c, map.get(c)+1);
				}
				else
				{
					map.put(c, 1);
				}
			}
			System.out.println(map);

	}
	
	public static void main(String[] args) {
		getCharCount("AJINKYA");
	}

}
