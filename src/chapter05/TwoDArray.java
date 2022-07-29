package chapter05;

public class TwoDArray {

	public static void main(String[] args) {
		double a[][] = new double[4][4];
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.random(); 
				int rNumber = (int)(a[i][j] * 10); 
				System.out.print(rNumber + "\t");
			}
			System.out.println();
		}

	}

}
