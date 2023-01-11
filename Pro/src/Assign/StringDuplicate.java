package Assign;

public class StringDuplicate {

	public static void main(String[] args) {
		
		String s[]= {"abc", "bcd", "efg","abc","hij"};
		
		for (int i=0; i<s.length; i++) {
			
			for(int j=i+1; j<s.length;j++) {
				if(s[i]==s[j]) {
					System.out.println("The duplicate are: "+ s[j]);
			}
		}

	}

	}
}
