package chapter04;

import java.util.Scanner;

public class Tese2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		while(true) {
			System.out.println("추측한 숫자를 입력하세요: ");
			int guess= scanner.nextInt();
			double a = Math.random(); //난수
			int numberToGuess = (int)(a * 10);
			if (guess>numberToGuess) {
				System.out.println("틀렸습니다.");
				System.out.println("추측한 숫자가 너무 큼.");
			}else if(guess<numberToGuess) {
				System.out.println("틀렸습니다.");
				System.out.println("추측한 숫자가 너무 작음.");
			}else if(guess==numberToGuess) {
			
				System.out.println("정답입니다.");
				
			}
			
		}
	}

}
