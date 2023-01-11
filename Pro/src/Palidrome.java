import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
	
		int n=121, r,sum=0;
		int temp=n;
		  
		  
		
		
	//	Scanner s = new Scanner(System.in);
		
	//	System.out.println("Enter the Number");
		// n =s.nextInt();

		 while(n>0){    
			   r=n%10;   
			   n=n/10;  
			   sum=sum*10+r;    
			     
			  }    
		
			
		
	if (temp ==sum) {
	 System.out.println(sum + "is palidrome");
	}
	else {
		System.out.println(sum + " not palidrome");
	}
	}
	

}
