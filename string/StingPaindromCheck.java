//THIS PROGRAM REVERSE THE STRING AND CHECK STRING IS PALANDROM OR NOT
public class StingPaindromCheck {
	// MAIN FUNCTION
	public static void main(String[] args) {
		String s = "aakash";
		String reversofs = "";
		int i = s.length() - 1;
		// LOGIC FOR REVERSE A STRING
		for (; i >= 0; i--) {
			reversofs = reversofs + s.charAt(i);
		}
		System.out.println(s);
		System.out.println(reversofs);
		// CHECK FOR PALINDROM STRING OR NOT
		if (s.equals(reversofs)) {
			System.out.println("palindrom string");
		} else {
			System.out.println(" not a palindrom string");
		}
	}
}