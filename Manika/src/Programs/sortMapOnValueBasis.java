package Programs;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class sortMapOnValueBasis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm
        = new HashMap<String, Integer>();

    // enter data into hashmap
    hm.put("Math", 98);
    hm.put("Data Structure", 85);
    hm.put("Database", 91);
    hm.put("Java", 95);
    hm.put("Operating System", 79);
    hm.put("Networking", 80);
    
 // Create a list from elements of HashMap
    List<Map.Entry<String, Integer> > list
        = new LinkedList<Map.Entry<String, Integer> >(
            hm.entrySet());

    // Sort the list using lambda expression
    Collections.sort(
        list,
        (i1,
         i2) -> i1.getValue().compareTo(i2.getValue()));

    // put data from sorted list to hashmap
    HashMap<String, Integer> temp
        = new LinkedHashMap<String, Integer>();
    for (Map.Entry<String, Integer> aa : list) {
        temp.put(aa.getKey(), aa.getValue());
    }

    Map<String, Integer> hm1 = temp;
    
    System.out.println(hm1);
    
	}

}
