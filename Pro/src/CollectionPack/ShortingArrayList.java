package CollectionPack;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> bl = new ArrayList<Integer>();
		al.add(12);
		al.add(98);
		al.add(67);
		al.add(76);

		for (Integer i : al) {
			System.out.print(" " + i);
		}

		al.sort(null);
		bl = al;
		System.out.println(bl);

		for (int i = bl.size() - 1; i >= 0; i--) {
			System.out.print(" " + bl.get(i));
		}

	}

}
