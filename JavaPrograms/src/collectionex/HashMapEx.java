package collectionex;

import java.util.Hashtable;
import java.util.Map;
import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		Map<String, String> hash_table = new HashMap<>();
		hash_table.put("1", "Monday");
		hash_table.put("1", "Tuesday");
		hash_table.put("1", "Wednesday");
		hash_table.put("1", "Thurdsday");
		hash_table.put("1", "Friday");
		hash_table.put("1", "Saturday");
		hash_table.put("1", "Sunday");
		System.out.println(hash_table);
		Map<String, String> hclone =(Map<String, String>) ((HashMap<String, String>)hash_table).clone();
		System.out.println("***"+hclone);
		

	}

}
