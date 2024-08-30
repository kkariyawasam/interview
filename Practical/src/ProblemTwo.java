
public class ProblemTwo {
	
	public static void main(String[] args) {
		int[] list1 = {1, 3, 5, 7}; 
		int[] list2 = {2, 4, 4, 9,}; 
		
		 int[] combinedArray = new int[list1.length + list2.length];  

	        
	        for (int i = 0; i < list1.length; i++) {
	            combinedArray[2 * i] = list1[i];    
	            combinedArray[2 * i + 1] = list2[i]; 
	        }
	        
	        for (int num : combinedArray) {
	            System.out.print(num + " ");
	        }
	}

}
