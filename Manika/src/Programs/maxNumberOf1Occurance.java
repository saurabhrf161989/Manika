package Programs;

public class maxNumberOf1Occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s = "110000111101011010110010111111111111110001011101010111011111111001";
//String[] str = s.split("0");
//System.out.println(str.length);
		
		int num = 222;
		 
        // Convert the integer to its binary representation as a string
        String binary = String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
        System.out.println(binary);
        int count = 0;
        int maxCount = 0;
 
        // Loop through the binary string to find the longest consecutive 1s
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
 
        // Print the result
        System.out.println("The length of the longest consecutive 1s in the binary representation is: " + maxCount);
    
	}
		

}
