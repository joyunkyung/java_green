package chapter02;

import java.util.Scanner;

public class ExMaxMin {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if (a>b && a>c && b>c) {
			System.out.println("최대값은 "+ a);
			System.out.println("최소값은 "+ c);
		}else if (b>a && b>c && a>c) {
			System.out.println("최대값은 "+ b);
			System.out.println("최소값은 "+ c);
		}else if (c>a && c>b && a>b) {
			System.out.println("최대값은 "+ c);
			System.out.println("최소값은 "+ b);
		}else if (a>b && a>c && c>b) {
			System.out.println("최대값은 "+ a);
			System.out.println("최소값은 "+ b);
		}else if (b>a && b>c && c>a) {
			System.out.println("최대값은 "+ b);
			System.out.println("최소값은 "+ a);
		}else if (c>a && c>b && b>a) {
			System.out.println("최대값은 "+ c);
			System.out.println("최소값은 "+ a);
	}
	}
}
