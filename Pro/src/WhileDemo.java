
public class WhileDemo implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread();
		t1.start();
		int i=0;
		int f=2;
		while( i <10 || f>10) {
			
			
			System.out.println(i);
			i++;
			try {
				t1.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			f++;
			
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
