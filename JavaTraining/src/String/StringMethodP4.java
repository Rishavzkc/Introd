package String;

public class StringMethodP4 {

	public static void main(String[] args) {
		
		String text ="United State";
		System.out.println(text.substring(5));
	
	System.out.println(text.substring(5, 9));
	
	//charArray
	char[] charArray =text.toCharArray();
	System.out.println("Main String is :" +text);
	
	for (int i=0; i<charArray.length; i++) {
		System.out.println(charArray[i]);
	}
	
	System.out.println(text.toLowerCase());
	System.out.println(text.toUpperCase());

	String text1="Rishav";
	String text2="Kumar";
	
	//System.out.println(text1+ text2);
	System.out.println(text1.trim() +text2);
	}
}
