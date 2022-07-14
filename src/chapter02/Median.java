package chapter02;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수 3개 입력>> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a>b && b>c) || (a<b && b<c)) {
			System.out.println(b);
		}else if(b>a && a>c || (b<a && a<c)) {
			System.out.println(a);
		}else if(a>c && c>b || (a<c && c<b)) {
			System.out.println(c);
		}else {
			
		}
	}

}
