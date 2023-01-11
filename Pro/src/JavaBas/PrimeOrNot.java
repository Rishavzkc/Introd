package JavaBas;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		int num =7; 
		int temp =0;
		
		for (int i=2; i<num; i++) {
			if(num %i==0) {
				temp++;
			}
		}
		if(temp==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
	}


