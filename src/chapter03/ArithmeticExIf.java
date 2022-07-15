package chapter03;

import java.util.Scanner;

public class ArithmeticExIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산 >> "); //먼저적기 
		int a = 0;
		a = scanner.nextInt();
		//int a = scanner.nextInt(); 로 한번에 합쳐도 됨
		String i = "";
		i = scanner.next();
		int b = 0;
		b = scanner.nextInt();
		
		if(i.equals("+")) { //문자열 ==
			System.out.println(a + i + b + "의 계산 결과는 " + (a+b));
			
		}else if (i.equals("-")) {
			System.out.println(a + i + b + "의 계산 결과는 " + (a-b));
		}else if (i.equals("*")) {
			System.out.println(a + i + b + "의 계산 결과는 " + (a*b));
		}else if (i.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다 ");
				return; // 완전 종료
			} else {
				System.out.println(a + i + b + "의 계산 결과는 " + (a/b));
	}
				
	}
	}

}
