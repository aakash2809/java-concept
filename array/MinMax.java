//THIS PROGRAM REPRESENTS SECOND MINIMUM AND SECOND MAXIMUM VALUE
public class MinMax {
	public static void main(String[] args) {
		// ARRAY DECLARATION AND INITIIALIZATION
		int arr[] = { 832, 500, 100, 400, 900, 500, 600, 200, 400, 675 };
		int max = arr[0];// ASSIGNIG FIRST ELEMENT OF ARRAY TO MAX
		int secondmax = arr[0];// ASSIGNIG FIRST ELEMENT OF ARRAY TO SECOND MAX
		int min = arr[0];// ASSIGNIG FIRST ELEMENT OF ARRAY TO MIN
		int secondmin = arr[0];// ASSIGNIG FIRST ELEMENT OF ARRAY TO SECOND MIN
		// TO PRINT THE INPUT ARRAY
		System.out.println("The given array is:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n=============================");
		// LOGIC TO FIND SECOND MIN AND SECOND MAX VALUE
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				secondmax = max;
				max = arr[i];
			} else if (arr[i] > secondmax) {
				secondmax = arr[i];
			}

			if (arr[i] < min) {
				secondmin = min;
				min = arr[i];
			} else if (arr[i] < secondmin) {
				secondmin = arr[i];
			}
		}
		// TO PRINT THE SECOND MIN AND SECOND SECOND MAX VALUE
		System.out.println("\nSecond maximum number is: " + secondmax);
		System.out.println("\nSecond minimum number is: " + secondmin);

	}

}
