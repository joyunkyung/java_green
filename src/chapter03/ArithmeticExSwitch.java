package chapter03;

import java.util.Scanner;

public class ArithmeticExSwitch {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산 >> "); //먼저적기 
		int a = scanner.nextInt(); 
		String i = scanner.next();
		int b = scanner.nextInt(); 
		
		
		switch (i) {
		case "+":
			System.out.println(a + i + b + "의 계산 결과는 " + (a+b));
			break;
		case "-":
			System.out.println(a + i + b + "의 계산 결과는 " + (a-b));
			break;
		case "*":
			System.out.println(a + i + b + "의 계산 결과는 " + (a*b));
			break;
		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다 ");
							return; // 완전 종료
			} else {
				System.out.println(a + i + b + "의 계산 결과는 " + (a/b));
			}//if else 를 case 안으로 넣어야함
			break;
		default:
			System.out.println("사칙연산이 아님");
			return;
		}

	}

}
