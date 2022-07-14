package chapter03;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하고 마지막에 -1 입력");
		
		int n = scanner.nextInt(); //scanner=객체
		while ( n!= -1) {
			sum += n;
			count++;
			n = scanner.nextInt(); //반복문 안에 scanner->계속 입력 받음
		}
		if(count==0) {
			System.out.println("입력된 수 x");
		}else {
		System.out.println("정수의 갯수는 " + count + "개이며 ");
		System.out.println("평균은 " +(double)sum/count + "입니다");
	}
	}
}
