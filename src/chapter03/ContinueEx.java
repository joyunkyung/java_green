package chapter03;

import java.util.Scanner;

public class ContinueEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요.");
		int sum = 0;
		
			
		for (int k = 0; k <=4; k++) {
			int i = scanner.nextInt(); //계속 받아야하니까 for문안에 들어와야함
			if(i<=0) {
				continue;
			}else {
				sum+=i;
			}
		}System.out.println("양수의 합은 " + sum);
	}

}
