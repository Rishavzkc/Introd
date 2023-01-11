package Pract;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySort {
public static void main(String[] args) {
	

	ArrayList<String> al =new ArrayList<String>();
	
	al.add("Red");
	al.add("Green");
	al.add("White");
	al.add("Yellow");
	al.add("Pink");
	al.add("Red");
	
	
	System.out.println("Before sorting : " +al);

	Collections.sort(al);
	
	System.out.println("After sorting : "+ al);

}

}

