import java.util.Arrays;

public class ProblemFour {
	
	public static void main(String[] args) {
	  int[] numbers = {50, 2, 1, 9};  
      String largestNumber = formLargestNumber(numbers);
      System.out.println(largestNumber);
  }

  public static String formLargestNumber(int[] numbers) {
    
      String[] strNumbers = new String[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
          strNumbers[i] = String.valueOf(numbers[i]);
      }

      Arrays.sort(strNumbers, (a, b) -> {
          return (b + a).compareTo(a + b);
      });

      if (strNumbers[0].equals("0")) {
          return "0";
      }

      StringBuilder result = new StringBuilder();
      for (String s : strNumbers) {
          result.append(s);
      }

      return result.toString();
  
  }

}
