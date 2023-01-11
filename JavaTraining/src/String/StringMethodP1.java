package String;

public class StringMethodP1 {
public static void main(String[] args) {
	
	String text = "Hi We are leaning from easybix.com";
	
	char ch = text.charAt(12);
	
	System.out.println(text.charAt(5));
	System.out.println(ch);
	
	System.out.println(text.charAt(1));
	
	String text2 = text.concat(" to sucess").concat(" and we learning Java");
	System.out.println(text2);
	
	System.out.println(text.contains("Key1"));
	
	System.out.println("Message ending with .com: " + text.endsWith("m") );
}
}
