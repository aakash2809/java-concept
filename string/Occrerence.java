mport java.util.Scanner;

//THIS PROGRAM GIVES THE OCCURANCE OF CHARACTeR IN PROVIDED STRING
public class Occrerence {
	public static void main(String[] args) {
		int count, j, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any String");
		String sr = sc.nextLine();
		// STRING TO CHARACTER ARRAY CONVERSION
		char[] a = sr.toCharArray();
		// LOGIC TO COUNT EACH CHARACTER OCCERENCE
		for (int i = 0; i < a.length; i++) {
			count = 0;
			char m = a[i];
			for (j = 0; j < a.length; j++) {
				if (a[j] == m) {
					count++;

					for (k = j; k < (a.length) - 1; k++) {
						if (a[k] == '\0') {
							break;
						} else

						{
							a[k] = a[k + 1];

						}

					}
					j--;

					a[k] = '\0';

				}
			}
			// TO PRING CHARACTER AND ITS OCCURENCE IN PROVIDED STRING
			System.out.println(m + "=" + count);

		}
	}
}
