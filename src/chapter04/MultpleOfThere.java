package chapter04;

import java.util.Scanner;

public class MultpleOfThere {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("양의 정수 10개를 입력하시오>> ");
		int[] a = new int[10];
		
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			if (a[i]%3 == 0) {
				System.out.println(a[i]);
			}
			
		}
	
	}

}
