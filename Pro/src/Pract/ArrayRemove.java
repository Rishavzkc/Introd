package Pract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayRemove {

	public static void main(String[] args) {
		
		//By converting into arraylist
		
		  String[] array= {"John", "Jack", "Andrew", "james"};
		  
		  ArrayList<String> list =new ArrayList( Arrays.asList(array));
		  
		  System.out.println(list);
		  
		  list.remove(1); System.out.println(list);
		 
		
		
		int []arr1 = {10,20,30,40,50,60,70,80};
		

		/*
		 * System.out.println("original"+Arrays.toString(arr1));
		 * 
		 * int index =2; for (int i=index; i<arr1.length-1; i++) { arr1[i]= arr1[i+1]; }
		 * System.out.println("Modifie"+Arrays.toString(arr1));
		 * 
		 */
		   
		
		  int index =3; 
		  for (int i=index; i<arr1.length-1; i++)
		  { 
			  arr1[i]= arr1[i+1];
		  System.out.println(arr1[i]); 
		  }
		 
		 
		
			/*
			 * int[]arr2= new int[arr1.length];
			 * 
			 * 
			 * int index=2;
			 * 
			 * for (int i=0; i<arr1.length; i++) { if(!(i==index)) {
			 * 
			 * arr2[i] =arr1[i]; }
			 * 
			 * } for(int i=0; i<arr2.length; i++) { System.out.println(arr2[i]);
			 * 
			 * }
			 */		 
		 
		/*
		 * int[] arr2 = new int[arr1.length - 1]; int index=3;
		 * 
		 * for (int i = 0, j = 0; i < array.length; i++) { if (i != index) { arr2[j++] =
		 * arr1[i]; }
		 * 
		 * } //System.out.println(arr2[]);
		 */		 }
	
		
	}


