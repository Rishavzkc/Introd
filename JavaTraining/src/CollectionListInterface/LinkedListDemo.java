package CollectionListInterface;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		
		list.add(13); 
		list.add("john");
		list.add(34);
		list.add("jack");
		
		System.out.println(list);
		list.addFirst(89);
		System.out.println(list);
		
		list.addLast("Home");
		System.out.println(list);
	}
}
