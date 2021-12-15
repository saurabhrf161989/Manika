package Programs;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "manika";
String rev = "";
for(int i = s.length()-1; i>=0; i--) {
	char c = s.charAt(i);
	rev = rev +c;
}
System.out.println(rev);
	}

}
