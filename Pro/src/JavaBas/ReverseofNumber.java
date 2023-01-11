package JavaBas;

public class ReverseofNumber {

	public static void main(String[] args) {
		
		int num =1563;
		int sum =0;
		int rem;
		
		while(num>0) {
			rem =num%10;
			num=num/10;
			sum=sum*10+rem;
			
		}
		System.out.println("Reverse of number is "+ sum);

	}

}
