package CollectionBas;

public class PassingArraytoMethod {

	public static void main(String[] args) {
		
		String s[]= {"John","Jack","Andrew"};
		int a[]= {35,30,25};
		
		details(s,a);
	}
	
	public static void details(String name[], int age[]) {
		
		for(int i=0;i<name.length; i++) {
			System.out.println("Name is "+ name[i] +"Age is  "+ age[i]);
		}
		
	}

}
