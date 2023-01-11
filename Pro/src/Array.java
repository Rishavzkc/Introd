
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= new int [5];
		/*
		 * a[0]=2; a[1]=3; a[2]=4; a[3]=5; a[4]=6;
		 */
		
		for (int i =0;i<a.length; i++ ) {
			a[i]=i +1;
		}
		
		
	// for (int i=0; i<a.length; i++)
		
		for(int i:a) {
		System.out.println(i);
		}
		
		
	}

}
