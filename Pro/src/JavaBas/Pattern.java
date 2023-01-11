package JavaBas;

public class Pattern {

	public static void main(String[] args) {
		/*  1 2 3
		 *  4 5 6
		 *  7 8 9
		 */
int a=1;
		for(int i=1;i<=3; i++) {
			for (int j=1; j<=3; j++) {
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
	}

}
