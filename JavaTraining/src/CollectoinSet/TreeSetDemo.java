package CollectoinSet;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet tset =new TreeSet<>();
		
		tset.add(12);
		tset.add(34);
		 tset.add(887);
		 tset.add(34);
		 tset.add(654);
		 tset.add(111);
		 tset.add(434);
		 
		 
 System.out.println(tset);
		 
		 //tSet.remove(111);
		 //System.out.println(tSet);
		 
		 System.out.println("Set Contains 12 ? " + tset.contains(12));
		 
		 System.out.println("First Element of TreeSet : " +tset.first());
		 System.out.println("Last Element of TreeSet : " +tset.last());
		 
		 System.out.println("Use of HeadSet : " +tset.headSet(111));
		 System.out.println("Use of TailSet : " +tset.tailSet(111));
		 
		 System.out.println("Use of SubSet : " +tset.subSet(34, 788));
		 
		 tset.clear();
		 System.out.println(tset);
	}

}
