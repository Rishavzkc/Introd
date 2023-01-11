
public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  for (int i=1; i<=4; i++) {
		  
		  System.out.print(" * "); 
		 }
		  System.out.println("");
		 */
		
		//star pattern
		/*
		  for(int i=1; i<=4; i++) { for(int j=1; j<=4; j++) { System.out.print(" * ");
		 } System.out.println(); }
		 */
		
		
		//decreasing * by one
		
		  for (int i=1; i<=4; i++) { for(int j=1; j<=i; j++) { System.out.print(" * ");
		  }
		  
		  System.out.println(); }
		 
		
		//number print 
		/*
		 * for(int i=1; i<=4; i++) { for (int j=1; j<=4; j++) { System.out.print(j
		 * +" "); } System.out.println(""); }
		 */
		 
	
		
		  for(int i=1; i<=4; i++) {
			  for (int j=1; j<=4; j++) {
				  
		  
		  int k =i +j -1;
		  if(k>4)
			  System.out.print(k-4 +" ");
		  else
			  System.out.print(k  +" ");
		  
		  
		  } System.out.println(" "); }
		  
		  System.out.println("");
		 
	}

}
