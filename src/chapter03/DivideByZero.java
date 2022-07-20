package chapter03;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;
		int diviser;
		
		System.out.println("분자를 입력하시오: ");
		dividend = scanner.nextInt();
		System.out.println("분모를 입력하시오: ");
		diviser = scanner.nextInt();
		
		System.out.println(dividend+ "을(를) " + diviser + "로 나누면 몫은  " + dividend/diviser);
		scanner.close();

	}

}
