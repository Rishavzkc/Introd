package CollectionPack;

public class ArrayDuplicate {

	public static void main(String[] args) {
		
	int num []= new int [] {2,4,5,6,10,2,0};
	
	for(int i=0; i<num.length; i++) {
		
		for (int j=i+1; j<num.length; j++) {
			
			if( num[i]==num[j]) {
				System.out.println(num[j]);
				
			
			}
			
		}
	
	}
		}

}
