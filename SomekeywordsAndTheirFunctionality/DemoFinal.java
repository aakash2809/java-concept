
public class DemoFinal {
	int a = 10;
	static final String startWeek = "monday";// final vairable

	DemoFinal() {
		System.out.println("default constructor");
	}

	void show() {
		System.out.println("show method");
		a += 10;
		System.out.println("a - " + a);
		System.out.println("startweek - " + startWeek);
	}

	void show1() {
		System.out.println("show1 method");
		// ---> startWeek="sunday";//this will give error because final vairable can not
		// be modified
		System.out.println("startweek - " + startWeek);
	}

	public static void main(String[] args) { // Thanks
		new DemoFinal().show();
		new DemoFinal().show1();
	}

}
