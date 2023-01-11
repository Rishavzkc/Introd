import java.util.Random;

public class EnhancedFor {

	public static void main(String[] args) {
		
		int []num=new int [10];
		
		Random r=new Random();
		for (int i=0; i<10; i++) {
			num [i]=r.nextInt(30);
		}
		//for (int i=0; i<num.length; i++)
		for(int n:num)
		{
		//System.out.println(num[i]);
	
		System.out.println(n);
		}
	}
}
