
public class Reverse {

	public static void main(String[] args) {
		
		int num =Integer.parseInt(args[0]);
		
		int rem=0;
		int result=0;
		
		while (num>0) {
			rem =num % 10;
			result = result * 10 + rem;
			num =num /10;
		}
		System.out.println("Reverse number : " +result);
	}
}
