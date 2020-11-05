import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(30);
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		Collection s = new ArrayList();
		s.add("m");

		al2.add("raju");
		al2.add(10);
		al.add("aakash");
		al.add(10);
		al.add(10.3f);

		al.add(null);
		al.add("aakash");
		al.add("aakash");
		al.add("aakash");
		al.add("aakash");
		al.add("aakash");
		al.add(1, 15);
		System.out.println(al);
		System.out.println(al.contains("raju"));
		al.add(10, 10);
		al1 = (ArrayList) al.clone();

		System.out.println(al1);
		System.out.println(al1.get(0));

		al.add(al2);// adding two object al and al2

		System.out.println(al);
		System.out.println(al.contains(al2));
		System.out.println(al.contains("raju"));
		al.add("raju");
		System.out.println(al);
		System.out.println(al.contains("raju"));
		System.out.println(al.indexOf("aakash"));
		System.out.println(al.lastIndexOf(al2));
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		al.addAll(s);

		System.out.println(al);

	}
}
