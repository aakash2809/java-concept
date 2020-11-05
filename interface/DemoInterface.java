interface demoI {
	public void show();
}

//Classes don't define body to functions defined in interface 
//	- THEN Class also becomes abstract
abstract class DemoII implements demoI {
	abstract public void afun();
	
	public void show1() {
		System.out.println("show1 method");
	}
}

public class DemoInterface extends DemoII {
	
	public void afun() {
		//code..
	}
	
	public void show() {
		System.out.println("show method");
	}

	public static void main(String[] args) {
		new DemoInterface().show();
		new DemoInterface().show1();
		
		//can't create abstract class object
		//new DemoII().show1();
	}

}
