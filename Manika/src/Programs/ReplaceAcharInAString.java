package Programs;

public class ReplaceAcharInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "BOOKEEPER";
		int first = s.indexOf("E");
		int second = s.indexOf("E", first + 1);
		int third = s.indexOf("E", second + 1);
		
		System.out.println(second);
		 StringBuilder string = new StringBuilder(s);
	        string.setCharAt(second, '#');
	        System.out.println(string);
	}

}
