package CollectionPack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterate {

	public static void main(String[] args) {

		HashMap <String, String> hm =new HashMap <String, String>();
		hm.put("Name","John");
		hm.put("location", "India");
		hm.put("lang", "Eng");
		hm.put("DOJ", "Jan");
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pair = (Entry) it.next();
			System.out.println(pair.getKey()+" = "+pair.getValue());
		}

	}

}
