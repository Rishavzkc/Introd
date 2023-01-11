package String;

public class StringMethodP3 {

	public static void main(String[] args) {
		
		String text ="Hello Team";
		String sample="I am from India";
		
		String text1 =text.replace("e", "o");
		String sample1=sample.replace("am", "work");
		
		System.out.println(text1);
		System.out.println(sample1);
		
		
		String[] sampletext =sample.split(" ");
		
		for(int i=0;i<sampletext.length; i++) {
			System.out.println(sampletext[i]);
		}
		
		System.out.println(sample.startsWith("am"));
	}
}
