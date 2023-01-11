import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the Year");
		
		Scanner sc =new Scanner(System.in);
		
		int year=sc.nextInt();
		

		if (year %4 ==0) {
			System.out.println(year +" is leap year");
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
