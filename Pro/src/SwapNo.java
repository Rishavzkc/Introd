
public class SwapNo {

	public static void main(String[] args) {
		
		//int num1 =Integer.parseInt(args[0]);
		//int num2 =Integer.parseInt(args[0]);
		int num1 =20;
	    int num2 =10;
		
		System.out.println("Before Swapping : "+num1);
		System.out.println("Before Swapping : "+num2);
		
		num1 =num1 +num2;
		num2 =num1 -num2;
		num1 =num1 -num2;
		
	System.out.println("Number1 : "+num1);
	System.out.println("Number2 : "+num2);

	}

}
