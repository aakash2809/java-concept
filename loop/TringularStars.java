import java.util.Scanner;

//THIS PROGRAM PRINTS STARS IN TRINGULAR PATTERN
public class Tringular {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int n = sc.nextInt();
		// LOOP TO PRINT STAR IN TRINGULAR FORMATE
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");// TO PRINT SPACE
			}
			// PRINTING STAR
			for (int k = 0; k < n - i; k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
	}
}