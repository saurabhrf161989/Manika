package Programs;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 132321;
		int reverse = 0; 
	    int temp = n; 
	    while (temp != 0) { 
	      reverse = (reverse * 10) + (temp % 10); 
	      temp = temp / 10; 
	    } 
	    if (reverse == n) 
	    	System.out.println(n+" is a palindrome number");
	    else
	    	System.out.println(n+ " is not a palindrome number");
	}

}
