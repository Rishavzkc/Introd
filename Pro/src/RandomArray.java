import java.util.Random;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random r =new Random();
		
		int a[]=new int [20];
		
		for (int i=0; i<a.length;i++)
		{
			a[i]=r.nextInt(20);
		}
		
		for (int i:a)
		{
			System.out.println(i);
		}
	}

}
