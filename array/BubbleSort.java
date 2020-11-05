//THIS PROGRAM REPSENT BUBBLE SORTING
import java.util.Scanner;

public class BubbleSort {
	// MAIN METHOD
	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of element");
		int n = sc.nextInt();
		int a[] = new int[n];
		// SCANNING ELEMENT FOR THE ARRAY
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		// BUBBLE SORT LOGIC
		System.out.println("your sorted array is");
		for (int i = 0; i < n; i++) {
			i = i + 1;
			for (int j = 0; j < n - i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}

			}
		}
		// TO PRINT SORTED ARRAY
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);
		}

	}

}
