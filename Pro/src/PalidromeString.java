
public class PalidromeString {

	public static void main(String[] args) {
		
		String s="madam";
		String rev="";
		
for (int i=s.length()-1; i>=0; i--) {
	rev =rev+s.charAt(i);
}
System.out.println("Original String "+ s);
System.out.println("Reverse String "+rev);

if(s.equals(rev)) {
	System.out.println("Palidrome");
}

  else { System.out.println("Not Palidrome"); 
  }
 }

}
