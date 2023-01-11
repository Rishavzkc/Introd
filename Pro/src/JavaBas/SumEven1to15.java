package JavaBas;

public class SumEven1to15 {

	public static void main(String[] args) {
	
		int i;
		int sum=0;
		
		for ( i=1; i<=15; i++) {
			if (i %2==0) {
				sum =sum+i;
			}
		}
System.out.println(sum);
	}

}
