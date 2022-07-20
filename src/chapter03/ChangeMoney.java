package chapter03;

import java.util.Scanner;

public class ChangeMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오>> ");
		int n;
		n = scanner.nextInt();
		int a = n/50000;
		int b = (n%50000)/10000;
		int c = (n%10000)/1000;
		int d = ((n%10000)%1000)/100;
		int e = (((n%10000)%1000)%100)/50;
		int f = ((((n%10000)%1000)%100)%50)/10;
		int g = (((((n%10000)%1000)%100)%50))%10;
	
		System.out.println("오만원권 " + a + "매");
		System.out.println("만원권 " + b + "매");
		System.out.println("천원권 " + c + "매");
		System.out.println("백원 " + d + "개");
		System.out.println("오십원 " + e + "개");
		System.out.println("십원 " + f + "개");
		System.out.println("일원 " + g + "개");
	}			

}
