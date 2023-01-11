package CollectionBas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {

ArrayList<String> al =new ArrayList<String>();

al.add("Java"); 
al.add("SQL"); 
al.add("Selenium"); 
al.add("Aptitude");


//ListIterator
ListIterator li=al.listIterator();
System.out.println("In Forward Direction");
while(li.hasNext()) {
	
	System.out.println(li.next());
}
System.out.println("In Backward Direction");
while(li.hasPrevious()) {
	
	System.out.println(li.previous());
}

//Collection

Collections.sort(al);
System.out.println("Increasing order:" +al);

Collections.reverse(al);
System.out.println("Reverse Order: "+ al);

	}

}
