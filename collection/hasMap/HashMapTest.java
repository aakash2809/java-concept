import java.io.Serializable;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap a = new HashMap();

		a.put(1, "aakash");
		a.put(7, "ramu");
		a.put(3, "ritu");
		a.put(0, "ritu");
		a.put(8, "preti");
		a.put(4, "preti");
		a.put(10, "luky");
		Object k = a.put(10, "raj"); // return previous object value which is associated with duplicate key Object
		Set b = a.keySet();

		System.out.println(k);
		System.out.println(a);

		System.out.println(a.get(3)); // return value at key 3
		System.out.println(a.values()); // return all the value insertion order not preserve
		System.out.println(a.entrySet()); // returns all entries insertion order not preserve
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
		System.out.print("[");
		for (Object c : b) {
			System.out.print(c + "=" + a.get(c) + " , ");

		}
		System.out.println("]");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		System.out.println("hashmap implements Serializable interface");
		System.out.println(a instanceof Serializable);
		System.out.println("hashmap implements Cloneable interface");
		System.out.println(a instanceof Cloneable);
		System.out.println("hashmap implements RandomAccess interface");
		System.out.println(a instanceof RandomAccess);
		System.out.println(
				"-----------------------------------------------------------------------------------------------");

		HashMap<Integer, String> l = new HashMap<Integer, String>();
		l.put(1, "hi");
		l.put(2, "hello");
		l.put(3, "gn");
		Set<Entry<Integer, String>> m = l.entrySet();
		for (Entry<Integer, String> c : m) {
			System.out.println(c);
		}

	}

}
