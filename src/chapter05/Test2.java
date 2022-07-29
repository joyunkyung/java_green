package chapter05;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1=가위, 2=바위, 3=보 중 해당 숫자 하나 입력 ");
		double a = Math.random(); 
		int b = (int)(a * 3)+1;
		int c = scanner.nextInt();
		
		
		System.out.print("컴퓨터: ");
		if (b == 1) {
			System.out.print("가위");
		}else if (b == 2) {
			System.out.print("바위");
		}else{
			System.out.print("보");
		}
		System.out.println();
		
		System.out.print("사용자: ");
		if (c == 1) {
			System.out.print("가위");
		}else if (c == 2) {
			System.out.print("바위");
		}else{
			System.out.print("보");
		}
		System.out.println();
		
		if(b == c) {
			System.out.print("비김");
		}else if (b == 1 && c == 2 ||  b == 2 && c == 3 || b == 3 && c == 1) {
			System.out.print("사용자 승");
		}else if (b == 1 && c == 3 ||  b == 2 && c == 1 || b == 3 && c == 2) {
			System.out.print("컴퓨터 승");
		}		
	}

}
