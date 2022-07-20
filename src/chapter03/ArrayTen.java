package chapter03;

import java.util.Scanner;

public class ArrayTen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요");// (a.length +"개의 정수를 입력하세요")
		int a[] = new int[10];
		//a = scanner.nextInt();
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = scanner.nextInt();
			sum+=a[i];	
		}
		System.out.println("합계는 "+sum);
	}

}
