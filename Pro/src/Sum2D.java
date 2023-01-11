
public class Sum2D {

	public static void main(String[] args) {
		int a[][] = { { 12, 13 }, { 1, 2 }, { 12, 13 }, { 23, 12 } };
		int b[][] = { { 13, 12 }, { 23, 13 }, { 12, 34 }, { 2, 3 } };

		int sum[][] = new int[2][4];
		System.out.println(a.length);
		System.out.println(b.length);
		
		
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j <4; j++) {

				
				  sum [i][j]= a[i][j]+b[i][j];
				  
				  
				  for(int i2 =0; i2<1; i2++) {
					  for (int j2=0; j2<3; j2++) {
				  System.out.println(sum[i2][j2]); } 
					  }
				  
				 
			}
		}

	}

}
