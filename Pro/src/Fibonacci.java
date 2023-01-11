import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		/*
		 1 1 2 3 5 8 13 21 .....N
		 */
		
		//M1
		
		  int num = Integer.parseInt(args[0]); //(for input from command line)
		  
		  int f1 ; int f2 =0; int f3 =1;
		  
		  for(int i =1 ; i <=num ; i++ ) {
		  
		  System.out.println(f3); f1=f2; f2=f3; f3 =f1+f2; }
		  
		 
		
		/*
		 * int k, a=1, b=1;
		 * 
		 * Scanner sc= new Scanner(System.in); k=0;
		 * System.out.println("Enter any number"); int n =sc.nextInt();
		 * System.out.print("1  1"); while(k<=n) { k=a+b; if (k>=n) break;
		 * System.out.print(k +" "); a=b; b=k; }
		 */
	}

}
