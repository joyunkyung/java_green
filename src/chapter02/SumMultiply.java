package chapter02;

import java.util.Scanner;

public class SumMultiply {

	public static void main(String[] args) {
		System.out.print("2���� ���� �Է�>> ");
		Scanner scanner = new Scanner(System.in);
		
		int a  = scanner.nextInt();
		int b  = scanner.nextInt();
		System.out.println("�� ���� ����"+ (a+b) );
		System.out.println("�� ���� ����"+ (a*b) );
	}

}
