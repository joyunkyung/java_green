package chapter02;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		System.out.print("2개의 실수 입력>> ");
		Scanner scanner = new Scanner(System.in);
		
		double a  = scanner.nextDouble();
		double b  = scanner.nextDouble();
		
		System.out.println("두 수의 덧셈 "+ (a+b));
		System.out.println("두 수의 뺄셈"+ (a-b));
		System.out.println("두 수의 곱셉 "+ (a*b));
		System.out.println("두 수의 나눗셈 "+ (a/b));
	}

}
