import java.io.Serializable;
import java.util.HashSet;
import java.util.RandomAccess;

public class SetHashSetClass {

	public static void main(String[] args) {

//----------------------------Order Not preserve, duplicates are not allowed------------------------------------//

		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(10);
		hs.add("raju");
		hs.add(5);
		hs.add(4);
		hs.add("aakash");
		hs.add(0);
		hs.add("bt");
		hs.add(-1);
		hs.add(5);// duplicateand returen false
		hs.add(4);// duplicatereturen false
		System.out.println(hs.add(5)); // false
		System.out.println(hs.add(4)); // false

		System.out.println(hs);// order not preserved
		System.out.println("-----------------------------------------------------------------");

		// ----------------------------ImplementS Serializable and cloneable Interface
		// but not RandomAccess -----------------------------------//

		System.out.print(" HashSet implements Serializable    ");
		System.out.println(hs instanceof Serializable);
		System.out.print(" HashSet implements Cloneanle       ");

		System.out.println(hs instanceof Cloneable);
		System.out.print(" HashSet implements RandomAccess    ");
		System.out.println(hs instanceof RandomAccess);
		System.out.println("-----------------------------------------------------------------");

	}

}
