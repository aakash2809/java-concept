import java.util.*;

public class DemoHashmap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmapObj = new HashMap<Integer, String>();

		hashmapObj.put(1, "first");
		hashmapObj.put(2, "second");
		hashmapObj.put(3, "third");
		hashmapObj.put(4, "four");
		
		// METHOD 1 : using SET

		Set setObj = hashmapObj.entrySet();
		Iterator itrObj = setObj.iterator();
		while (itrObj.hasNext()) {
			Map.Entry mapObj = (Map.Entry) itrObj.next();
			System.out.println("keys - "+mapObj.getKey()+""
					+ " values - "+mapObj.getValue());
		}
		
		// METHOD 2 : using Foreach

		System.out.println("foreach");
		for (Map.Entry<Integer, String> entryObj : hashmapObj.entrySet()) {
			System.out.println("keys - "+entryObj.getKey());
			System.out.println("values - "+entryObj.getValue());
		}

	}
}
