package chapter02;

import java.util.Scanner;

public class ExCalculation {

	public static void main(String[] args) {
		System.out.print("2���� �Ǽ� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		
		double a  = scanner.nextDouble();
		double b  = scanner.nextDouble();
		
		System.out.println("�μ��� ������ "+ (a+b));
		System.out.println("�μ��� ������ "+ (a-b));
		System.out.println("�μ��� ������ "+ (a*b));
		System.out.println("�μ��� �������� "+ (a/b));
	}

}
