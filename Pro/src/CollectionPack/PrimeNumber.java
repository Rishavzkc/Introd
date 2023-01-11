package CollectionPack;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		System.out.println("ENter Number");
		int num = sc.nextInt();
		
		int temp =0;

		for(int i=2; i<num; i++) {
			if (num % i==0) {
				temp ++;
			}
		}
			if (temp==0) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not Prime");
			
		}
	}

}
