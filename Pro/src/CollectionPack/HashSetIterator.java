package CollectionPack;

import java.util.HashSet;
import java.util.Iterator;



public class HashSetIterator {

	public static void main(String[] args) {
	
		HashSet <String> hs =new HashSet<String>();
	    hs.add("Mango");
	    hs.add("Banana");
	    hs.add("Orange");
	    
	    
	    Iterator<String> it =  hs.iterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }

	}

}
