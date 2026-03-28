package Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevAStringWithSpaceNoChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "this is my name jay";

		String[] strArray = str.split(" ");


		ArrayList<String> list = new ArrayList<String>();

		for(String s: strArray) {
			list.add(s);
		}
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);

	}

}
