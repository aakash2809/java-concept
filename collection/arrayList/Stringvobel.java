import java.util.ArrayList;
import java.util.Scanner;

//THIS PROGRAM EXTRACT VOBELS FROM PROVIDED STRING
public class Stringvobel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.nextLine();// TO SCAN USER STRING
		char m[] = p.toCharArray();
		// ARRAYLIST DECLARATION
		ArrayList<Character> j = new ArrayList();
		for (int i = 0; i < m.length; i++) {
			if (m[i] == 'a' || m[i] == 'e' || m[i] == 'i' || m[i] == 'o' || m[i] == 'u' || m[i] == 'A' || m[i] == 'E'
					|| m[i] == 'I' || m[i] == 'O' || m[i] == 'U') {
				j.add(m[i]);
			}
		}
		// ARRAYLIST ITRATION FOR PRINTING VOVLES
		for (Object a : j) {
			System.out.println(a);
		}

	}
}