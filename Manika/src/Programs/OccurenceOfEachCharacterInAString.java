package Programs;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfEachCharacterInAString {
	public static void occurenceOfEachCharacter(String str) {
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] charArray = str.toCharArray();
		for(char c: charArray) {
			if(map.containsKey(c)) 
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
			
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		occurenceOfEachCharacter("geeksforgeeks");
	}

}
