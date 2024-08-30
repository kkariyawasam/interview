public class ProblemOne {
	public static void main(String[] args) {
		int[] array = { 2, 3, 5, 6, 8 };
		int sum = 0;
		int lenght = array.length;
		forLoop(array, sum, lenght);
		whileLoop(array, sum, lenght);
		recursion(array, sum, lenght);

	}

	public static void recursion(int[] array, int sum, int n) {
		if (n <= 0) {
			System.out.println(sum);
			return;
		}
		sum = sum + array[n - 1];
		recursion(array, sum, n - 1);
	}

	private static void whileLoop(int[] array, int sum, int lenght) {
		int i = 0;

		while (i < lenght) {
			sum += array[i];
			i++;
		}
		System.out.println(sum);

	}

	public static void forLoop(int[] array, int sum, int lenght) {
		for (int i = 0; i < lenght; i++) {
			sum = sum + array[i];
		}
		System.out.println(sum);

	}

}
