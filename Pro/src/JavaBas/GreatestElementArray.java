package JavaBas;

import java.util.Scanner;

public class GreatestElementArray {

	public static void main(String[] args) {

Scanner sc =new Scanner(System.in);

System.out.println("Enter the Size of array");
int size=sc.nextInt();

System.out.println("Enter the element of Array:");

int a[]=new int [size];
for(int i=0; i<a.length; i++) {
	a[i]=sc.nextInt();
}

int max=a[0];

for(int j=0;j<a.length; j++) {
	if(a[j]>max) {
		max=a[j];
	}
}
System.out.println("The max are:" +max);
	}

}
