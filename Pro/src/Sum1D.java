
public class Sum1D {
public static void main(String[] args) {
	
	int a[]= {1,2,3,4,5,6,7,8,9};
	int b[]= {2,3,4,5,6,7,8,9,1};
	
	int sum[] =new int[10];
	
	for(int i=0; i<a.length; i++) {
		sum[i]= a[i]+ b[i];
		
		System.out.println(sum[i]);
	}
	
	
}
}
