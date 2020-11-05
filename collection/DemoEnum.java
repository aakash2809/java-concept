import java.util.Scanner;

public class DemoEnum {
	// Enum declaration
	enum Weekdays {
		MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter integer - ");
		
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();
		
		System.out.println("input - "+userInput);
		switch(userInput) {
		case 1:
			System.out.println("day is - "+Weekdays.MONDAY);
			break;
		case 2:
			System.out.println("day is - "+Weekdays.TUESDAY);
			break;
		case 3:
			System.out.println("day is - "+Weekdays.WEDNESDAY);
			break;
		default:
			System.out.println("day is - "+Weekdays.SUNDAY);
			break;
		}
	}
}
