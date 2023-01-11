package JavaBas;

public class PrimeNoInArray {

	public static void main(String[] args) {
	
		int a[]= {0,1,4,56,2,99,11,7, 5,19} ;
	
		
	
		for (int i=0; i<a.length; i++) 
		{
			/*
			 * if((a[i]!=0) &&(a[i]!=1)) {
			 */
			  int temp=0;
				for(int j=2; j<a[i]; j++) 
				{
					if(a[i]%j ==0)
					{
						temp=1;
						break;
					}
				}
				if (temp==0) {
					System.out.println("Prime no:-" +a[i]);
				}
		//	}

				
			
			
		}
	}
}


