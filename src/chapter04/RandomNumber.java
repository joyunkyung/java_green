package chapter04;

public class RandomNumber {

	public static void main(String[] args) {
		for (int i = 0; i <100; i++) {
			double a = Math.random(); //난수
			int rNumber = (int)(a * 10);
			System.out.println(rNumber);
			if (rNumber==7) {
				break;
			}
			
		}

	}

}
