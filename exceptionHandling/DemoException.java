public class DemoException {
	public static void show() throws ArithmeticException {
		throw new ArithmeticException("calculation mistake");		
	}
	
	public static void main(String[] args) {
		try {
//			Arithmetic Exception
//			int i = (int)(Math.random()*10);
//			System.out.println("division - "+10/i);
			DemoException.show();
		}
		catch(Exception e) {
			System.out.println("exception - "+e);
		}
		finally {
			System.out.println("this code will always run, "
					+ "no matter any exception will occure or not");
		}
	}
}
