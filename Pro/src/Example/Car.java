package Example;

public class Car extends Vechile {

	Vechile v =new Car();
	public static void main(String[] args) {
	
		 
		Vechile v =new Car();
		
		
		v.run();
		
		//Encapsulation
		v.setName("Bmw");
		System.out.println(v.getName());
		
		
	}
	

	//Inheritance
	@Override
	public void run() {
		System.out.println("Car is running");
	}
	


}
