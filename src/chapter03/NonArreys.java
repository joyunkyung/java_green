package chapter03;

public class NonArreys {

	public static void main(String[] args) {
		int n[][] = new int[4][]; //행
		
		n[0] = new int[3]; // 1행  3열
		n[1] = new int[2]; // 2행 2열
		n[2] = new int[3]; // 3행 3열
		n[3] = new int[2]; // 4행 2열
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (i+1)*10+j;
				System.out.print(n[i][j]+" "); 
			
			}
			System.out.println();
		}
	}

	}

