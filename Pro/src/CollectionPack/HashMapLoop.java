package CollectionPack;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapLoop {

	public static void main(String[] args) {
		
		HashMap <String, String> hm =new HashMap <String, String>();
		hm.put("Name","John");
		hm.put("location", "India");
		hm.put("lang", "Eng");
		hm.put("DOJ", "Jan");
		
		
		  for (String kye:hm.keySet()) {
			  
			  System.out.println(kye +hm.get(kye)); }
		 
		
		Iterator it = hm.keySet().iterator();
		
		
		
		//System.out.println(hm.keySet()+" "+ hm.values());
		
		/*
		 * while(it.hasNext()) { System.out.println(it.next()); }
		 */
	}

}
