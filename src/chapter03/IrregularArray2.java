package chapter03;

public class IrregularArray2 {

	public static void main(String[] args) {
		int a [][] = new int[5][];
		a[0] = new int[5]; 
		a[1] = new int[1]; 
		a[2] = new int[4]; 
		a[3] = new int[2]; 
		a[4] = new int[3]; 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j]= (i+3)*10+j+5;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
