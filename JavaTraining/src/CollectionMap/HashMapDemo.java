package CollectionMap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap hmap =new HashMap ();

		hmap.put("Name"," John" );
		hmap.put("Place","Delhi");
		hmap.put("class", 3);
		hmap.put(4, true);
		
		
		System.out.println(hmap);
		
		if (hmap.containsKey("Name")) {
			System.out.println("Name of persion is: "+ hmap.get("John"));
		}
		System.out.println("Size of HashMap is : " + hmap.size());
		System.out.println("Is hashMap Empty  " + hmap.isEmpty());
		hmap.clear();
		System.out.println("Is hashMap Empty  " + hmap.isEmpty());
	}

}
