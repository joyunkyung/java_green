package chapter03;

import java.util.Scanner;

public class DivideByZeroHandling {
	public static void main(String[] args) {		
			Scanner scanner = new Scanner(System.in);
			
			int dividend;
			int diviser;
			
			while (true) {
				System.out.println("분자를 입력하시오: ");
				dividend = scanner.nextInt();
				System.out.println("분모를 입력하시오: ");
				diviser = scanner.nextInt();
			
			
			try {
				System.out.println(dividend+ "을(를) " + diviser + "로 나누면 몫은  " + dividend/diviser);
				break; // 무한반복이라서 빠져 나올 수 있게 걸어줘야함 
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
	}
	scanner.close();
}
}

			
			
//			int dividend;
//			int diviser;
//			
//			System.out.println("분자를 입력하시오: ");
//			dividend = scanner.nextInt();
//			System.out.println("분모를 입력하시오: ");
//			diviser = scanner.nextInt();
//			
//			System.out.println(dividend+ "을(를) " + diviser + "로 나누면 몫은  " + dividend/diviser);

		



	


