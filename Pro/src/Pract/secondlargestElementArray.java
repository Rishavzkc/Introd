package Pract;

public class secondlargestElementArray {

	public static void main(String[] args) {
		
		int temp;
	      int a[] = {10, 20, 25, 63, 96, 57};
	     

	      for(int i = 0; i<a.length; i++ ){
	         for(int j = i+1; j<a.length; j++){

	            if(a[i]>a[j]){
	               temp = a[i];
	               a[i] = a[j];
	               a[j] = temp;
	            }
	         }
	      }
	      
//	  	System.out.println("The sorted array are:");
//		for(int m=0; m<a.length; m++) {
//			System.out.println(a[m]);
//		}

	      System.out.println("Third second largest number is:: "+a[a.length-2]);
	   }

	}


