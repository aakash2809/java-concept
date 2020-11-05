class MethodOverLoad {
	//ADD METHOD TO ADD TWO INTEGER
	void add(int a, int b) {

		int sum = a + b;
		System.out.println("Sum of a+b is " + sum);

	}
	//SAME ADD METHOD WITH DOUBLE PARAMETER TO ADD TWO DOUBLE VALUES
	void add(double a, double b) {
		double sum = a + b;
		System.out.println("Sum of a+b is " + sum);
	}
	//SAME ADD METHOD WITH STRING PARAMETER TO CONCATINATE TWO STRING
	void add(String s1, String s2)

	{
		String s = s1 + s2;
		System.out.println(s);
	}
}
//MAIN METHOD
public class OverLoading {
	public static void main(String[] args){
		MethodOverload obj = new MethodOverload();
		obj.add(1, 2);
		obj.add("Life ", "Line");
		obj.add(11.5, 22.5);
	}
}
