package chapter03;

public class Ex3_10 {

	public static void main(String[] args) {
		double score [][] = {{3.3, 3.4},
							 {3.5, 3.6},
							 {3.7, 4.0},
							 {4.1, 4.2}}; //4행2열
		double sum = 0;
		for (int i = 0; i < score.length; i++) { //행
			for (int j = 0; j < score[i].length; j++) { //열
				sum+= score[i][j];
			}
		}
		int n = score.length;
		int m = score[0].length;
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m));
	}

}
