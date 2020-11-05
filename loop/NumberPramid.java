import java.util.Scanner;

//THIS PROGRAM REPRESENTS THE NUMBER PRAMID
public class NumberPramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int n = sc.nextInt();// SCANNING NUMBER OF ROWS
		int m = n;// CREATE COPY NO OF ROWS
		// PRAMID CREATION LOGIC AND PRINT
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < n - i; k++) {
				m = n - k;
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}
}
