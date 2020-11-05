import java.util.ArrayList;
import java.util.Iterator;

public class DemoArraylist {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		//elements addition
		al.add("f");
		al.add("s");
		al.add("f");
		
		//display 
		System.out.println("array list - "+al);
		System.out.println("size of array list - "+al.size());
		
		//add element at specific position
		al.add(2, "t");
		System.out.println("array list after addition - "+al);
		
		//update any element
		al.set(1, "z");
		System.out.println("array list after set - "+al);
		
		// iteration/traversing
		Iterator<String> itrObj = al.iterator();
		while(itrObj.hasNext()) {
			System.out.println("element - "+itrObj.next());
		}
		
	}

}
