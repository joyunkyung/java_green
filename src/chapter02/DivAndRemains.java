package chapter02;

import java.util.Scanner;

public class DivAndRemains {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("2자리수 정수를 입력(10~99)>> ");
		
		int a = scanner.nextInt();
		
		if(a>=10 && a<=99) {
			if(a%11 ==0) {
				System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
			} else {
				System.out.println("다르다");
			}
		}
	}

}
