package JavaBas;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		//153 =1^3+ 5^3+ 3^3 =1+ 125+27 =153

		int num =153; int original=num;
		int rem =0;
		int sum =0;
		
		while(num>0) {
			rem =num%10;
			num=num/10;
			
			sum =sum + rem * rem* rem;	
		}
		if(sum ==original) {
			System.out.println("Armstrom Number");
		}
		else {
		System.out.println("Not armstrong Number");
		}
	}

}
