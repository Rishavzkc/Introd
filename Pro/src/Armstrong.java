
public class Armstrong {

	public static void main(String[] args) {
		
		int n =153;
		int temp =0;
		int arm =0;
		
		int original=n;
		
		//M1
		/*while (n>0) {
			
			
			temp =n % 10;
			
			temp = (int) Math.pow(temp, 3);
			
			arm =arm +temp;
			
			n=n /10;
		
		}*/
		//M2
		while(n>0)
		{
			temp =n%10;
			n=n/10;
			arm=arm + temp*temp*temp;
		}
		
		if (arm ==original) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not Armstrong Number");
		}

	}

}
