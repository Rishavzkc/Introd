package JavaBas;

public class SumOfNoBtwn1to30DivisibleBy5 {

	public static void main(String[] args) {

		int num =5; 
		int sum=0;
 for(int i =1; i<=30; i++) {
	 if(i%num ==0) {
		 sum=sum+i;
	 }
 }
System.out.println(sum);
	}

}
