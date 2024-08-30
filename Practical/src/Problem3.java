import java.math.BigInteger;

public class Problem3 {
	
	public static void main(String[] args) {
		int count = 100; 
        BigInteger[] fibonacciNumbers = FibonacciNumber(count);
        
     
        for (BigInteger num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }

    public static BigInteger[] FibonacciNumber(int n) {
        if (n <= 0) {
            return new BigInteger[0];
        }
        
        BigInteger[] numArray = new BigInteger[n];
        numArray[0] = BigInteger.ZERO;
        if (n > 1) {
            numArray[1] = BigInteger.ONE;
        }
        
        for (int i = 2; i < n; i++) {
            numArray[i] = numArray[i - 1].add(numArray[i - 2]);
        }
        
        return numArray;
    
    }}

