package Pract;

import java.util.ArrayList;

public class ListInsertion {

	public static void main(String[] args) {
		
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Red");
		al.add("Green");
		al.add("White");
		al.add("Yellow");
		al.add("Pink");
		
		al.add(0, "Grey");

		System.out.println("ArrayList : "+ al);
		System.out.println("First Element: " +al.get(3));
		
		if(al.contains("Red")) {
			System.out.println("Element Present");
		}
		else {
			System.out.println("Not Found");
		}
		
		/*
		 * for (String str: al) { System.out.println(al); }
		 */
	}

}
