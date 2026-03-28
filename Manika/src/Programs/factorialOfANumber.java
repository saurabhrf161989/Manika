package Programs;

public class factorialOfANumber {
	public static int factorialOfANumber(int n) {
		if(n==0) {
			return 1;
		}
		return n*factorialOfANumber(n-1);
	}
	static int factorial(int n) 
    { 
        int res = 1, i; 
        for (i = 2; i <= n; i++) 
            res *= i; 
        return res; 
    } 
	
	public static void main(String[] args) {
		System.out.println(factorialOfANumber(0));
		int num = 5; 
        System.out.println( 
            "Factorial of " + num 
            + " is " + factorial(5)); 
    } 
	
}
