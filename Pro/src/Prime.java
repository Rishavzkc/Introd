import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		int num ;
		int i, temp =0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		num =s.nextInt();
		
		for (i=2; i<num ; i++) {
			if (num %i ==0) {
				temp ++;
				
			}
		}
if (temp ==0) {
	System.out.println("Prime Number");
}
else {
	System.out.println("Not Prime");
}
	}

}
