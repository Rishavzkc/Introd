package JavaBas;

import java.util.Scanner;

public class ArraySumAvg {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size;
		size=sc.nextInt();
		int []a=new int[size];
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int j=0; j<a.length; j++) {
			sum =sum=a[j];
		}
		System.out.println("Sum" + sum);
		
		float average=(float)sum/a.length; 
		 System.out.println("Average : "+average); 

	}

}
