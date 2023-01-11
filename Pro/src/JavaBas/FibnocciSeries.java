package JavaBas;

public class FibnocciSeries {

	public static void main(String[] args) {
		
		//1 1 2 3 5 8 13 21...
		
		int num=10;
		int f1;
		int f2=1;
		int f3=f2;
		
		for(int i=1; i<=num; i++) {
			System.out.println(f3);
			f1=f2; f2=f3; f3=f1+f2;
		}
		

	}

}
