package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorSample {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		for (int i=0; i<10; i++ ) {
			al.add(i);
			System.out.println("Element of Arraylist  "  +i);
		}
		
		Iterator itr= al.iterator();
		
		System.out.println("Starting Iterator");
	while(itr.hasNext()) {
		
		int i=(Integer)itr.next();
		
		System.out.println(i +"");
		if(i %2 !=0) 
			itr.remove();
		
	}
	System.out.println();
	System.out.println("After Removing" + al);
	
	}
}
