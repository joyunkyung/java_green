package chapter04;

public class RandomTen {

	public static void main(String[] args) {
		double sum = 0;
		
		for (int i = 0; i <10; i++) {
			double a = Math.random(); //난수
			int rNumber = (int)(a * 10);
				sum+=rNumber;
			
			System.out.println(rNumber);
			
		}
		System.out.println("평균" + sum/10);	

	}

}
