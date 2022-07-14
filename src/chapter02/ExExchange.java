package chapter02;

import java.util.Scanner;

public class ExExchange {

	public static void main(String[] args) {
		final double RATE = 1200.0;
		final double EUR = 1500.0;

		System.out.print("원화를  입력하세요(단위 원)>> ");
		Scanner scanner = new Scanner(System.in);  //그대로 쓰면됨
		
		
		int won = scanner.nextInt();  //객체.메소드
		System.out.println(won + "원은 " + "$" + won/RATE + "입니다.");
		System.out.println(won + "원은 " + "E" + won/EUR + "입니다.");
		
		
	}

}
