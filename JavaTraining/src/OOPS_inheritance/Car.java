package OOPS_inheritance;

public class Car {

	
	Car(){
		System.out.println("Creating Constructor of Car Class");
	}
	
	//final keyword
	public final void setWheels(){
		System.out.println("Only 4 Wheels are allowed");
	}
	
	String name = "Car Segment";
	
	
	public void run(){
		System.out.println("Car is Running");
	
	
	}
}
