import java.util.*;

public class DemoHashTableClass1 {
	public static void main(String[] args) {
		Enumeration keysReturnedInEnum;
		Hashtable<String, String> hashTableObj = new Hashtable<String, String>();
		
		hashTableObj.put("key1", "F");
		hashTableObj.put("key2", "S");
		hashTableObj.put("key3", "T");
		hashTableObj.put("key4", "F");
		
		System.out.println("---"+hashTableObj);
		System.out.println("---"+hashTableObj.keys());
		System.out.println("---"+hashTableObj.keySet());
		
		// Using Enumeration
		keysReturnedInEnum = hashTableObj.keys();
		while(keysReturnedInEnum.hasMoreElements()) {
			String keyStoredInHashTable = (String) keysReturnedInEnum.nextElement();
			System.out.println("Key - "+keyStoredInHashTable+
					" value stored - "+hashTableObj.get(keyStoredInHashTable));		
		}
		
		// Using KeySet
		for (String key:hashTableObj.keySet()) {
			System.out.println("key - "+key+" value - "+hashTableObj.get(key));
		}
		
		hashTableObj.remove("key2");
		System.out.println("---"+hashTableObj);
		
		Hashtable<Integer, String> hashTableObj1 = new Hashtable<Integer, String>();
		
		hashTableObj1.put(1, "V1");
		hashTableObj1.put(2, "V2");
		hashTableObj1.put(3, "V3");
		
		hashTableObj1.remove(2);
		System.out.println("---"+hashTableObj1);
	}
}
