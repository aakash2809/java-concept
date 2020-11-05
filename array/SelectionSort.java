//THIS PROGRAM REPRESENT SELECTION SORT ALGORITHM FOR SORTING AN ARRAY IN ASCENDING ORDER
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of element");
		int n = sc.nextInt();
		// ARRAY DECLARATION
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		System.out.println("your sorted array is");
		// SORTING LOGIC
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
		// PRINT SORTED ARRAY
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a[i]);

		}
	}
}
