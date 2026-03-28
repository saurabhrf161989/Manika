package Programs;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
		System.out.println("First number: " + a);
		System.out.println("Second Number:" + b);
		
		b = a+b - (a=b);
		
		System.out.println("a" +a);
		System.out.println("b" +b);
		
		
	}

}
