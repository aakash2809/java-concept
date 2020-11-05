import java.util.Collection;
import java.util.LinkedList;
public class LinkedListDemo {
	
public static void main(String[] args) {
		LinkedList ls=new LinkedList();
		ls.add("aakash");
		ls.add("raju");
		ls.add("aakash");
		ls.add(4);
		ls.add(4.5);
	System.out.println(ls.peek());
	System.out.println(ls);
	System.out.println(ls.get(0));
	ls.addFirst("ritu");
	System.out.println(ls);
    ls.remove("aakash");
	System.out.println(ls);
	System.out.println(ls.peek());

    System.out.println(ls);
	ls.set(0, "rinkki");
	System.out.println(ls);
     
		
    }
}
