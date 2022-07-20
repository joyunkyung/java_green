package chapter03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력 ");
		int sum =0, n=0;
		
		for (int i = 0; i < 3; i++) {
			System.out.print(i + ">>");
			try {
				n = scanner.nextInt();
				if (n == 9) {
					scanner.next();
					i--; 
					continue;
				}
				
			} catch (InputMismatchException e) {
				System.out.println("정수가 아니다.");
				scanner.next();
				i--; //정수를 입력할 때까지 반복
				continue; // 해당 반복부분 탈출 후 다음반복실행
			}
			sum += n;
		}
		System.out.println("합은 " + sum);
		scanner.close();

	}

}
