package ExceptionHandling;

public class SampleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try {
			int value = 100;
			
			int result = value/0;
			
			System.out.println(result);
		} catch(Exception e){
			
			System.out.println(e);
			System.out.println("Please choose another value to Divide the interger");
			
			e.printStackTrace();
			
		}
		
		try {
			String text = null;
			
			System.out.println(text.length());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
