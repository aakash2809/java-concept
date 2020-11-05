class DemoA {

	public void show() {
		System.out.println();
	}
}

public class DemoPolymorphism extends DemoA {
	// override parent class function
	// Override - called Annotation
	@Override
	public void show() {
		System.out.println("show DemoPolymorphism");
	}

	// Compile Time Polymorphism

	// CONSTRUCTOR OVERLOADING

	// Default constructor
	DemoPolymorphism() {
		System.out.println("default");
	}

	DemoPolymorphism(int i, int j) {
		System.out.println("2nd parameter");
	}

	// constructor accepting 3 integer parameter
	DemoPolymorphism(int i, int j, int k) {
		System.out.println("3rd parameter");
	}

	// constructor accepting string parameter
	DemoPolymorphism(String str) {
		System.out.println("string parameter");
	}

	public void show2() {
		System.out.println("show2 default ");
	}

	public void show2(int i) {
		System.out.println("show2 - i - " + i);
	}

	public static void main(String[] args) {
		// Object creation
		new DemoPolymorphism();
		new DemoPolymorphism(1, 2);
		new DemoPolymorphism(1, 2, 3);
		new DemoPolymorphism("str");

		new DemoPolymorphism().show(); // call child class function code
		new DemoA().show(); // call parent class function code

		new DemoPolymorphism().show2();
		new DemoPolymorphism().show2(10);
	}
}
