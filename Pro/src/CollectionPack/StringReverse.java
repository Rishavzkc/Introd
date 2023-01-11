package CollectionPack;

public class StringReverse {

	public static void main(String[] args) {

String name="Ram";
		  
		    StringBuilder sb=new StringBuilder(name);  
		   System.out.println(sb.reverse());  
		    
		// 2nd approch
		   
		   char ch[]=name.toCharArray();  
		    String rev="";  
		    for(int i=ch.length-1;i>=0;i--){  
		        rev+=ch[i];  
		    }  
		    System.out.println(rev);  
		    
		   
		}  

	}


