package String;

public class StringBufferIntro {

	public static void main(String[] args) {
	
		String name ="Rishav";
		name.concat("Kumar");
		
		System.out.println(name);
		
		StringBuffer name1 =new StringBuffer("Rishav");
		//name1.append(" Kumar");
		//name1.insert(2, "Kumar");
		
		//name1.replace(1,4, "kumar");
		
		//name1.delete(1, 3);
		name1.reverse();
		System.out.println(name1);
}
}
