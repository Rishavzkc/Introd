package Pract;

public abstract  class AbstractDe {
	
	 int i=100; 
	 
	 abstract public void price();
	 
	 public static void run() 
	 { 
	 System.out.println("In run"); 
	 }
	 
	 public static void main(String[] args) {
		
		 System.out.println("In main"); 
		//  System.out.println(i); 
		 run();  
	}
} 


