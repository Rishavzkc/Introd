package JavaBas;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array");
	int size =sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("Provide the element of array:");
	for(int i=0; i<a.length; i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("The Reverse of array are:");
	for(int j=a.length-1;j>=0;j--) {
		System.out.println(a[j]);
	}
		

	}

}
