package CollectionPack;

public class Prog {

	public static void main(String[] args) {
		
		


int marks[][] =new int[5][8];
	marks [0][0]=10;
	marks [0][1]=30;
	marks [1][0]=40;
	marks [1][1]=50;
		
	for (int i=0 ;i<marks.length; i++) {
		for(int j=0;j<marks.length; j++) {
			System.out.print(marks[i][j]);
		}
		System.out.println();
	}
	
	}

}
