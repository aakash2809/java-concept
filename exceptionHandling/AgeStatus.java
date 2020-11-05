import java.util.Scanner;

//CUSTOM EXCEPTION
class InvalidAgeExcepton extends Exception {

	InvalidAgeExcepton(String S) {
		super(S);
	}
}

//CLASS WHICH REPRESNT AGE IS VALID OR NOT
public class AgeStatus {
	// METHOD TO CHECKE AGE VALIDITY
	static void status(int age) {

		if (age >= 18) {
			System.out.println("elegible");
		}

		else {
			try {
				// THROW CUSTOM EXCEPTION
				throw new InvalidAgeExcepton("not elegible");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

	// MAIN METHOD
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		AgeStatus.status(i);
		sc.close();

	}

}
