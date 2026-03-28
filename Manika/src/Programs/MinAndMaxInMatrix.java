package Programs;

public class MinAndMaxInMatrix {
	public static void main(String[] args) {
		 int min = Integer.MAX_VALUE; 
		    int max = Integer.MIN_VALUE; 
		    int arr[][] = {{5, 9, 11}, 
                    {25, 0, 14}, 
                    {21, 6, 4}}; 
		    int n=3;
		    for (int i = 0; i < n; i++) 
	        { 
	            for (int j = 0; j <= n/2; j++) 
	            { 
	                // Compare elements from beginning 
	                // and end of current row 
	                if (arr[i][j] > arr[i][n - j - 1]) 
	                { 
	                    if (min > arr[i][n - j - 1]) 
	                        min = arr[i][n - j - 1]; 
	                    if (max< arr[i][j]) 
	                        max = arr[i][j]; 
	                } 
	                else
	                { 
	                    if (min > arr[i][j]) 
	                        min = arr[i][j]; 
	                    if (max< arr[i][n - j - 1]) 
	                        max = arr[i][n - j - 1]; 
	                } 
	            } 
	        } 
	        System.out.print("Maximum = "+max+ 
	                         ", Minimum = "+min); 
		    
	}

}
