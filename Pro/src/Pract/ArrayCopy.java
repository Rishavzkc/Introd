package Pract;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayCopy {

	public static void main(String[] args) {
	
		
		ArrayList<String> al =new ArrayList<String>();
		al.add("12");
		al.add("34");
		al.add("67");
		al.add("89");
		
		ArrayList<String> al1 =new ArrayList<String>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		
	
		System.out.println("Before Coping e1 : "+ al);
		System.out.println("Before Coping e2 : "+ al1);
Collections.reverse(al);

System.out.print(al);
		Collections.copy(al, al1);
		
		System.out.println("After copying e1 : " +al);
		System.out.println("After copying e2 : " +al1);
	}

}
