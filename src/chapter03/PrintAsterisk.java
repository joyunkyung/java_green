package chapter03;

import java.util.Scanner;

public class PrintAsterisk {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하시오>> ");
		int k  = scanner.nextInt();
		

		for (int i = k; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
	

}
