package Pract;

public class RemoveElementArray {

	public static void main(String[] args) {
		 int m=3;
		
		int a []= new int []{23,45,67,89,43};
		
		int b[] =new int [a.length-1];
		
		for (int i=0; i<a.length;i++) {
			if (i<m) {
				b[i]=a[i];
			}
			else if (i==m){
				continue;
			}else {
				b[i-1]=a[i];
			}
			
			
		}
		System.out.println("Remaining element are:");
		for(int i=0;i<a.length-1;i++) {
			System.out.print(b[i]+" ");
		}
		
		

	}

}
