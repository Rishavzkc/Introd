package JavaBas;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CopyArray2OtherArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the elment of array:");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[a.length];
		for(int j=0; j<b.length; j++) {
			b[j]=a[j];
		}
		
		System.out.println("The copied element are:");
		for(int k=0; k<a.length;k++) {
			System.out.println(b[k]);
		}

	}

}
