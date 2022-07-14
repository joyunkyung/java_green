package chapter02;

import java.util.Scanner;

public class ExArea {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하시오>> ");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		double tri = (a+b)/2;
		double rec = (a+b)*c/2;
		
		
		if(c == 0) {//  ==이 이꼴
			System.out.println("삼각형의 넓이는 " + tri);
		}else {
			System.out.println("사다리꼴의 넓이는 " + rec);
		}
	}

}
