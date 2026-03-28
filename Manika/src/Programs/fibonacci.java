package Programs;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =9;
		if (n < 1) {
            System.out.println("Invalid Number of terms");
            return;
        }
 
        // When number of terms is greater than 0
        int prev1 = 1;
        int prev2 = 0;
 
        // For loop to print Fibonacci series
        for (int i = 1; i <= n; i++) {
            if (i > 2) {
                int num = prev1 + prev2;
                prev2 = prev1;
                prev1 = num;
                System.out.print(num + " ");
            }
 
            // For first two terms
            if (i == 1) {
                System.out.print(prev2 + " ");
            }
            if (i == 2) {
                System.out.print(prev1 + " ");
            }

	}
	}
}
