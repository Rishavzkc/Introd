package CollectionPack;

public class Palidrome {

	public static void main(String[] args) {
		
		int input = 1441;
		int num = input;
		int rem=0;
		int sum=0;

		
		while(num>0) {
			rem =num%10;
			sum =sum *10+rem;
			num =num/10;
			System.out.println(num);
		}
		System.out.println(sum);

	
	if (sum==input) {
	System.out.println("Palindrom");
	
	}
	else {
	System.out.println("Not Palidrom");
	}
	}

}
