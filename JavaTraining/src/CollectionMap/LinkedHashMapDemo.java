package CollectionMap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<>();
		
		lhmap.put("John", 27);
		lhmap.put("Kuamr", 47);
		lhmap.put("Jack", 26);
		lhmap.put("Johny", 23);
		lhmap.put("krish", 32);
		lhmap.put("John", 27);
		
		System.out.println(lhmap);
		System.out.println("Size of map : " + lhmap.size());
		System.out.println("Is map Empty : " + lhmap.isEmpty());
		System.out.println("Conatins value : " +lhmap.containsKey("Johny"));
		System.out.print("contins key : "+lhmap.containsValue(29) );

	}

}
