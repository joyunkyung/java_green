package chapter03;

import java.util.Scanner;

public class ArrayLangth {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("5개의 정수를 입력하세요>> ");
		int a[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i <5; i++) {
			
			a[i] = scanner.nextInt();
		}
		for (int i = 0; i <5; i++) {
			sum =sum + a[i];
			
		}
		
		System.out.println((double)sum/a.length);
		
	}

}
