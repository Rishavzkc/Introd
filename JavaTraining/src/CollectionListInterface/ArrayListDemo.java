package CollectionListInterface;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> lit =new ArrayList<Integer>();
		
		lit.add(2);
		lit.add(52);
		lit.add(89);
	
		System.out.println(lit);
		
		lit.remove(2);
		System.out.println(lit);

	}

}
