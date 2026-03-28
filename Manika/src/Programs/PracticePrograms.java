package Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PracticePrograms {
	
	// reverse of a string
public static void reverseAString(String str) {
	String[] stringArray = str.split(" ");
	
	for(String st: stringArray) {
		String rst = "";
		for(int i =0; i<st.length();i++) {
			char c = st.charAt(i);
			rst = c + rst;
		}
		System.out.print(rst + " ");
	}
	
}

//Duplicate in a string
public static void duplicateInAString(String str) {
	Map<Character, Integer> map = new HashMap<Character, Integer>();
	char[] charArray = str.toCharArray();
	for(char c: charArray) {
		if(map.containsKey(c)) 
			map.put(c, map.get(c)+1);
		else
			map.put(c, 1);
	}
	for(Map.Entry<Character, Integer> entry : map.entrySet()) {
		if(entry.getValue()>1)
		System.out.println(entry.getKey() + ":" + entry.getValue());
	}
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseAString("This is system");
		duplicateInAString("This is system");
	}

}
