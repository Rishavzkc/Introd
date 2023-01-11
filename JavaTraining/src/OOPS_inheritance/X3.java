package OOPS_inheritance;

public class X3 extends Bmw{

	static String model = "X3 ";
	
public static void main(String[] args) {
		
		Bmw bmw = new Bmw();
		
		System.out.println("Model is " + model);
		System.out.println("Brand is " + bmw.name);
		
		System.out.println("Behaviour is ");
		bmw.run();

	}
}
