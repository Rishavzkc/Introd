import java.util.Scanner;

public class Primeanumber {

	public static void main(String[] args) {
		
		int num;
		int temp=0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		num =sc.nextInt();
		
		for(int i=2; i<num; i++) {
			temp ++;			
		}
		if (temp ==0) {
			System.out.println("PrimeNumber");
		}
		else {
			System.out.println("Not Prime");
		}
		

		
	}

}
