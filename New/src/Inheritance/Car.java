package Inheritance;

public class Car extends Vechile{

	
	@Override
	public void run() {
		System.out.println("Car runssssss");
	}
	
	public static void main(String[] args) {
		
		Vechile v= new Car ();
		
		v.run();
       v.stand();
       	   
       }
	   public void print() {
       System.out.println("colour"+ colour);
       
       
       
       
	}

}
