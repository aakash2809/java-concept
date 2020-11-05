package practice;

//SUPER CLASS
class SuperClass {
	public void show() {
		System.out.println("In Super Class");
	}
}

//BASE CLASS
class BaseClass extends SuperClass {
	// SAME METHOD WITH SAME PARAMETER PRESET IN SUPER CLASS
	public void show() {
		System.out.println("In Base Class");
	}
}

//CALLAER CLASS
public class OverRidding {

	public static void main(String[] args) {
		SuperClass obj = new SuperClass();// OBJECT OF SUPER CLASS
		BaseClass obj1 = new BaseClass();// OBJECT OF BASE CLASS
		obj.show();// WILL CALL SUPER SHOW;
		obj1.show();// WILL CALL BASE SHOW;
	}

}