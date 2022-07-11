package chapter02;

import java.util.Scanner; //Scanner 필수

public class AreaCircle {

	public static void main(String[] args) {
		System.out.print("반지름을 입력하세요.>> ");
		Scanner scanner = new Scanner(System.in);
		
		double radius = scanner.nextDouble();  // 입력해야하는 값이 radius
		final double PI = 3.14; // 상수 
		double circleArearadius =radius * radius * PI;
		
		
		System.out.println("원의 면적은 " + circleArearadius + "입니다.");
		scanner.close(); // 생략가능
	}

}
