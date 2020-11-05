import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add("a");
		t.add("A");
		t.add("B");
		t.add("C");

		// t.add(null);

		// t.add(4);// genrate exception java.lang.ClassCastException
		System.out.println(t);
		System.out.println(t.first());

		System.out.println("-----------------------------------------------------------------");

		// ----------------------------ImplementS StirngBuffer does not comparable
		// interface-----------------------------------//
		/*
		 * 
		 * TreeSet t1= new TreeSet(); t1.add(new StringBuffer("aa")); t1.add(new
		 * StringBuffer("bb")); t1.add(new StringBuffer("m")); t1.add(new
		 * StringBuffer("cc")); System.out.println(t1); //genrate classCastException
		 * 
		 */

		// ----------------------------Customise sorting by using Comparator and second
		// constructor of of TreeSet-----------------------------------//

		TreeSet t2 = new TreeSet(new MyComarator());
		t2.add(10);
		t2.add(17);
		t2.add(4);
		t2.add(5);
		t2.add(0);

		System.out.println(t2);

	}

}
