
public class EnhancedFor2D {

	public static void main(String[] args) {
		/*
		 * int x[]= {1,2,3,4}; int y[]= {2,3,4,5}; int z[]= {4,5,6,7};
		 */
		int p[][]= {
				{1,2,3,4},
				{2,3,4,5},
				{4,5,6,7}
		};
		
		for (int i[]:p) {
			
			for(int j:i) {
				
			
			System.out.print(j +" ");
		}
			System.out.println(" ");
			}

}
}