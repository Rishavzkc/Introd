package CollectionListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
List  li =new ArrayList ();

li.add(0, 12);
li.add(1, 14);

System.out.println(li);

List lit = new ArrayList();
lit.add(10);
lit.add(11);
lit.add(14);
lit.add(35);

System.out.println(lit);

li.addAll(1, lit);


System.out.println(li);

List l3 =new ArrayList();
l3 =li.subList(3, 6);
System.out.println(l3);
	}

}
