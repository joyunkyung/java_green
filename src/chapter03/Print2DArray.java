package chapter03;
//import java.util.Arrays;
public class Print2DArray {

	public static void main(String[] args) {
		int n[][]   = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for (int i = 0; i < n.length; i++) { //n.length 행 5
			for (int j = 0; j <n[i].length; j++) { //n[i].length 열 , 1 3 1 4 2
				System.out.print(n[i][j]);
			}
			System.out.println();
		}
		
	}

}

