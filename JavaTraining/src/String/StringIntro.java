package String;

public class StringIntro {
public static void main(String[] args) {
	
	String name ="Kumar";
	String name1 ="Kumar";
	
	String country =new String ("India");
	
	System.out.println(name);
	System.out.println(country);
	
	String finalname =name +name1;
	
	System.out.println(name.equals(name1));
	System.out.println(name.concat(name1));
	System.out.println(finalname);
}
}
