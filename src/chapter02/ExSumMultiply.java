package chapter02;

import java.util.Scanner;

public class ExSumMultiply {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("3자리수 정수를 입력(100~999)>> ");
		
		int a = scanner.nextInt();
		int b = a/100;
		int c = (a/10)%10;
		int d = a%10;
		if(a>=100 && a<=999) {
			System.out.println("100의 자리와 10의 자리의 합은 " + (b+c));
			System.out.println("10의 자리와 1의 자리의 곱ㅇ느" + (c*d));
		}

	}
	

}
