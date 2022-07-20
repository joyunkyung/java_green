package chapter03;

public class CoronaSum {

	public static void main(String[] args) {
		int n[][] = new int[12][3];
		
		int sum=0;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				n[i][j] = (i+1)*10+j+1;
				sum+=n[i][j];
			}
			
		}
		System.out.println("1년 전체 코로나 환자수는 "+sum);
	}

}
